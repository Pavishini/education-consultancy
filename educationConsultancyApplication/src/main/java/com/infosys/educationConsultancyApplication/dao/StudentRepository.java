package com.infosys.educationConsultancyApplication.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.infosys.educationConsultancyApplication.bean.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
    @Query("SELECT MAX(s.registrationNum) FROM Student s")
    public String getMaxRegistrationNum();
    
    @Query("select a from Student a where a.status='true'")
	public List<Student> getCurrentStudents();
    
    @Query("select status from Student where userName=?1")
    public String getStudentStatusByUserName(String userName);
    
    @Query("select a from Student a where userName=?1")
   	public Student getStudentByUserName(String userName);
    
    
}


