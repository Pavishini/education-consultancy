package com.infosys.educationConsultancyApplication.dao;

import java.util.List;
import com.infosys.educationConsultancyApplication.bean.Student;

public interface StudentDao {
    public void save(Student student);
    public Student getStudentById(String id);
    public List<Student> getAllStudents();
    public String generateNewRegistrationNum();
    public List<Student> getCurrentStudents();
    public String getStudentStatusByUserName(String userName);
    public Student getStudentByUserName(String userName);
}