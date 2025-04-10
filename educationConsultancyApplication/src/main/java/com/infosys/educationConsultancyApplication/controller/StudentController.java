package com.infosys.educationConsultancyApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.educationConsultancyApplication.bean.Student;
import com.infosys.educationConsultancyApplication.dao.StudentDao;
import com.infosys.educationConsultancyApplication.service.EduconUserService;

@RestController
@RequestMapping("/edu-con/")
@CrossOrigin(origins = "http://localhost:3636")
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	
	@Autowired 
	private EduconUserService service;
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
		}
	
	@PostMapping("/student")
	public void saveStudent(@RequestBody Student student) {
	    String username = service.getUserId();
	    String email = service.getEmail();
	    
	    if (username == null || email == null) {
	        throw new RuntimeException("User not logged in or session expired.");
	    }

	    student.setUserName(username);
	    student.setEmail(email);
	    student.setStatus("true");
	    studentDao.save(student);
	}

	
	@PutMapping("/student")
	public void updateStudent(@RequestBody Student student) {
		studentDao.save(student);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable String id) {
		return studentDao.getStudentById(id);
	}
	
	@GetMapping("/student-id")
	public String generateNewRegistrationNum() {
		return studentDao.generateNewRegistrationNum();
	}
	
	@GetMapping("/student-other")
	public List<Student> getCurrentStudents(){
		return studentDao.getCurrentStudents();
		}
	@GetMapping("/student-status")
	public String getStudentStatusByUserName() {
		String userName=service.getUserId();
		return studentDao.getStudentStatusByUserName(userName);
	}
	@GetMapping("/student-me")
	public Student getStudentDetail() {
		String userName=service.getUserId();
		return studentDao.getStudentByUserName(userName);
	}

}