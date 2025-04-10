package com.infosys.educationConsultancyApplication.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private Long courseId;
	private String courseName;
	private Integer hours;
	private Double price;
	private String technology;
	public Course() {
		super();
		
	}
	public Course(Long courseId, String courseName, Integer hours, Double price, String technology) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.hours = hours;
		this.price = price;
		this.technology = technology;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", hours=" + hours + ", price=" + price
				+ ", technology=" + technology + "]";
	}
	
	
}