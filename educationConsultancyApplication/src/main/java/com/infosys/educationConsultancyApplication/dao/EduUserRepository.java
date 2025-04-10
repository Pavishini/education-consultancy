package com.infosys.educationConsultancyApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.educationConsultancyApplication.bean.EduconUser;

public interface EduUserRepository extends JpaRepository<EduconUser, String> {
    
}
