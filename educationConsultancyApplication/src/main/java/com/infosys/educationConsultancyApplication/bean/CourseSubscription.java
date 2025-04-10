package com.infosys.educationConsultancyApplication.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CourseSubscription {
	@Id
	private String subscriptionId;
	private String studentId;
	private Long courseId;
	private String subscriptionDate;
	private String endDate;
	private Integer installments;
	private double installmentAmount;
	private String status;
	public CourseSubscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CourseSubscription(String subscriptionId, String studentId, Long courseId, String subscriptionDate,
			String endDate, Integer installments, double installmentAmount, String status) {
		super();
		this.subscriptionId = subscriptionId;
		this.studentId = studentId;
		this.courseId = courseId;
		this.subscriptionDate = subscriptionDate;
		this.endDate = endDate;
		this.installments = installments;
		this.installmentAmount = installmentAmount;
		this.status = status;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getSubscriptionDate() {
		return subscriptionDate;
	}
	public void setSubscriptionDate(String subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Integer getInstallments() {
		return installments;
	}
	public void setInstallments(Integer installments) {
		this.installments = installments;
	}
	public double getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CourseSubscription [subscriptionId=" + subscriptionId + ", studentId=" + studentId + ", courseId="
				+ courseId + ", subscriptionDate=" + subscriptionDate + ", endDate=" + endDate + ", installments="
				+ installments + ", installmentAmount=" + installmentAmount + ", status=" + status + "]";
	}
	

}