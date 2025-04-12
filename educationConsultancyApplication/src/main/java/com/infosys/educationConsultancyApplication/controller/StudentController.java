package com.infosys.educationConsultancyApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.infosys.educationConsultancyApplication.bean.Student;
import com.infosys.educationConsultancyApplication.dao.StudentDao;
import com.infosys.educationConsultancyApplication.service.EduconUserService;

@RestController
@RequestMapping("/edu-con")
@CrossOrigin(origins = "http://localhost:3636")
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private EduconUserService service;

    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentDao.getStudentById(id);
    }

    @PostMapping("/student")
    public ResponseEntity<?> saveStudent(@RequestBody Student student) {
        try {
            // Optional: Override with session user details
            if (student.getUsername() == null || student.getEmail() == null) {
                student.setUsername(service.getUserId());
                student.setEmail(service.getEmail());
            }

            student.setStatus("true");
            System.out.println("Saving student: " + student);
            studentDao.save(student);
            return ResponseEntity.ok("Student saved successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Error saving student: " + e.getMessage());
        }
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) {
        studentDao.save(student);
    }

    @GetMapping("/student-id")
    public String generateRegistration() {
        return studentDao.generateRegistration();
    }

    @GetMapping("/student-other")
    public List<Student> getCurrentStudents() {
        return studentDao.getCurrentStudents();
    }

    @GetMapping("/student-status")
    public String getStudentStatusByUsername() {
        return studentDao.getStudentStatusByUsername(service.getUserId());
    }

    @GetMapping("/student-me")
    public Student getStudentDetail() {
        return studentDao.getStudentByUsername(service.getUserId());
    }
}
