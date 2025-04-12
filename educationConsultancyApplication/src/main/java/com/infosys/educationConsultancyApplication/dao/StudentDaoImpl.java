package com.infosys.educationConsultancyApplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.educationConsultancyApplication.bean.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository repository;

    @Override
    public void save(Student student) {
        repository.save(student); // handles insert/update
    }

    @Override
    public Student getStudentById(String id) {
        return repository.findById(id).orElse(null); // safely unwrap Optional
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public String generateRegistration() {
        String val = repository.getMaxRegistrationNumber();
        Long id = (val == null) ? 100001L : Long.parseLong(val.substring(1)) + 1;
        return "S" + id;
    }

    @Override
    public List<Student> getCurrentStudents() {
        return repository.getCurrentStudents();
    }

    @Override
    public String getStudentStatusByUsername(String username) {
        return repository.getStudentStatusByUsername(username);
    }

    @Override
    public Student getStudentByUsername(String username) {
        return repository.getStudentByUsername(username);
    }
}
