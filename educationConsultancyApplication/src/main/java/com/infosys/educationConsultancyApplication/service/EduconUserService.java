package com.infosys.educationConsultancyApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.infosys.educationConsultancyApplication.bean.EduconUser;
import com.infosys.educationConsultancyApplication.dao.EduUserRepository;

@Service
public class EduconUserService implements UserDetailsService{
	@Autowired
	private EduUserRepository repository;
	private String userId;
	private String category;
	private String email;
	
	public void save(EduconUser user) {
		repository.save(user);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		EduconUser user=repository.findById(username).get();
		this.userId=user.getUsername();
		this.category=user.getCategory();
		this.email=user.getEmail();
		return user;
	}
	public String getUserId() {
		return userId;
	}
	public String getCategory() {
		return category;
	}
	public String getEmail() {
		return email;
	}
	

}