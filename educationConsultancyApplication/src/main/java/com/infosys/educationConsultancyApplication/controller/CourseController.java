package com.infosys.educationConsultancyApplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.educationConsultancyApplication.bean.Course;
import com.infosys.educationConsultancyApplication.dao.CourseDao;

@RestController
@RequestMapping("/edu-con/")
@CrossOrigin(origins = "http://localhost:3636")
public class CourseController {
	@Autowired
	private CourseDao courseDao;
	
	@GetMapping("/course")
	public List<Course> displayAllCourses(){
		return courseDao.getAllCourses();
		}
	@PostMapping("/course")
	public void saveCourse(@RequestBody Course course) {
		courseDao.save(course);
	}
	@PutMapping("/course")
	public void updateCourse(@RequestBody Course course) {
		courseDao.save(course);
	}
	@GetMapping("/course/{id}")
	public Course displayCourseById(@PathVariable Long id) {
		return courseDao.getCourseById(id);
	}
	@DeleteMapping("/course/{id}")
	public void deleteCourseById(@PathVariable Long id) {
		courseDao.deleteCourseById(id);
	}
	@GetMapping("/course-id")
	public Long generateCourseId() {
		return courseDao.generateNewCourseId();
	}
	
}