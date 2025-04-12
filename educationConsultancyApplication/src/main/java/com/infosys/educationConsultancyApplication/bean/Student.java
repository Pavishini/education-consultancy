package com.infosys.educationConsultancyApplication.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private String registrationNumber;
	private String username;
	private String studentName;
	private String email;
	private String mobile;
	private String address;
	private String studentLevel;
	private String status;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String registrationNumber, String username, String studentName, String email, String mobile,
			String address, String studentLevel, String status) {
		super();
		this.registrationNumber = registrationNumber;
		this.username = username;
		this.studentName = studentName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.studentLevel = studentLevel;
		this.status = status;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudentLevel() {
		return studentLevel;
	}
	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Student [registrationNumber=" + registrationNumber + ", username=" + username + ", studentName="
				+ studentName + ", email=" + email + ", mobile=" + mobile + ", address=" + address + ", studentLevel="
				+ studentLevel + ", status=" + status + "]";
	}
	
}