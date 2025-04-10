package com.infosys.educationConsultancyApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.educationConsultancyApplication.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	@Query("select max(courseId) from Course")
	public Long getMaxCourseId();
	
	@Query("select a from Course a where technology=?1")
	public List<Course> getCourseByTechnology(String technology);
	
	
}