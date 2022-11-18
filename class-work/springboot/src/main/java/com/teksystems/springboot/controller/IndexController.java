package com.teksystems.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.springboot.database.dao.CourseDAO;
import com.teksystems.springboot.database.entity.Course;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Controller
public class IndexController {
	
	@Autowired
	private CourseDAO courseDao;
	
	@Value("${spring.datasource.url}")
	private String variable;
	
	@RequestMapping(value = {"/", "/index", "/index.html"}, method = RequestMethod.GET)
	public ModelAndView slash(@RequestParam(required = false) String courseName, @RequestParam(required = false) String instructorName) {
		System.out.println("courseName: " + courseName);
		System.out.println("instructorName: " + instructorName);

		ModelAndView response = new ModelAndView();
		response.setViewName("index");

		response.addObject("courseNameKey", courseName);
		response.addObject("instructorNameKey", instructorName);

		if(courseName != null && instructorName != null) {
			List<Course> courses = courseDao.findByNameOrInstructor(courseName, instructorName);
			response.addObject("courses", courses);
		}
		
		// System.out.println(coursesByInstructorName.get(0));
		
		return response;
	}
	
	@RequestMapping(value = {"/search"}, method = RequestMethod.GET)
	public ModelAndView search() {
		System.out.println("Index controller search request");
		
		return null;
	}

	@RequestMapping(value = {"/course"}, method = RequestMethod.GET)
	public ModelAndView course() {
		log.debug("Index controller request method");
		ModelAndView response = new ModelAndView();
		response.setViewName("course");
		return response;
	}

	@RequestMapping(value = {"/courseSubmit"}, method = RequestMethod.GET)
	public ModelAndView courseSubmit(@RequestParam(required = false) String courseName, @RequestParam(required = false) String instructorName) {
		ModelAndView response = new ModelAndView();
		response.setViewName("course");

		log.info("Index controller course submit method");
		log.info("Course Submit : courseName     : " + courseName);
		log.info("Course Submit : instructorName : " + instructorName);

		String errormessage = "";
		boolean error = false;
		if (courseName == null || courseName.equals("")) {
			errormessage = errormessage + "The course name can not be empty";
			error = true;
		}

		if (instructorName == null || instructorName.equals("")) {
			errormessage = errormessage + "The instructor name can not be empty";
			error = true;
		}

		if (error) {
			// there is an error
			log.info(errormessage);
			response.addObject("error", errormessage);
		} else {
			Course course = new Course();
			course.setName(courseName);
			course.setInstructor(instructorName);

			courseDao.save(course);
		}
		
		return response;
	}
	
}
