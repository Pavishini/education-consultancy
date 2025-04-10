package com.infosys.educationConsultancyApplication.dao;

import java.util.List;

import com.infosys.educationConsultancyApplication.bean.Course;

public interface CourseDao {
	public void save(Course course);
	public Course getCourseById(Long id);
	public List<Course> getAllCourses();
	public void deleteCourseById(Long id);
	public List<Course> getCoursesByTechnology(String technology);
	public Long generateNewCourseId();

}