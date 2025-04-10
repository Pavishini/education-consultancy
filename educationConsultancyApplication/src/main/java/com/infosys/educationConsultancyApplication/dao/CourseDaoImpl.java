package com.infosys.educationConsultancyApplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infosys.educationConsultancyApplication.bean.Course;

@Service
@Repository
public class CourseDaoImpl implements CourseDao {
	@Autowired
    private CourseRepository repository;
	
	@Override
	public void save(Course course) {
		repository.save(course);

	}

	@Override
	public Course getCourseById(Long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Course> getAllCourses() {
		return repository.findAll();
	}

	@Override
	public void deleteCourseById(Long id) {
		repository.deleteById(id);

	}

	@Override
	public List<Course> getCoursesByTechnology(String technology) {
		return repository.getCourseByTechnology(technology);
	}

	@Override
	public Long generateNewCourseId() {
		Long id=repository.getMaxCourseId();
		if(id==null)
			id=100001L;
		else
			id++;
		
		return id;
	}

}