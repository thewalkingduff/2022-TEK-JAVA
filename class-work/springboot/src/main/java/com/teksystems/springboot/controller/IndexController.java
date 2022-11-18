package com.teksystems.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teksystems.springboot.database.dao.CourseDAO;
import com.teksystems.springboot.database.entity.Course;




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
	
}
