//package com.teksystems.springboot.database.entity;
//
//import java.util.List;
//
//import javax.persistence.*;
//
//import lombok.*;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//
//@Table(name = "department")
//public class Department {
//
//	@Id
//	@EqualsAndHashCode.Include
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
//	private Integer id;
//
//	@Column(name = "name")
//	@EqualsAndHashCode.Include
//	private String name;
//	
//	// mapped by department because ... deparment is the name of the java variable in the Course entity
//	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@EqualsAndHashCode.Exclude
//	private List<Course> courses;	
//	
//	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@EqualsAndHashCode.Exclude
//	private List<Faculty> faculty;	
//
//	@Override
//	public String toString() {
//		return "Department Id: " + getId() + " | Name: " + getName();
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Department other = (Department) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
//
//	
//	
//	
//
//	
//
//	
//	
//	
//
//}

