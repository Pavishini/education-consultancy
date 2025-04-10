package com.infosys.educationConsultancyApplication.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private String registrationNum;
	private String userName;
	private String studentName;
	private String email;
	private Long mobile;
	private String address;
	private String studentLevel;
	private String status;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String registrationNum, String userName, String studentName, String email, Long mobile,
			String address, String studentLevel, String status) {
		super();
		this.registrationNum = registrationNum;
		this.userName = userName;
		this.studentName = studentName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
		this.studentLevel = studentLevel;
		this.status = status;
	}

	public String getRegistrationNum() {
		return registrationNum;
	}
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [registrationNum=" + registrationNum + ", userName=" + userName + ", studentName="
				+ studentName + ", email=" + email + ", mobile=" + mobile + ", address=" + address + ", studentLevel="
				+ studentLevel + ", status=" + status + "]";
	}
	
	
	

}