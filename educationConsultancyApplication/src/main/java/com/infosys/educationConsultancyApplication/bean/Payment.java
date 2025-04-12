package com.infosys.educationConsultancyApplication.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Payment {
	@Id
	private String billNumber; //auto generated
	private String subscriptionId; 
	private String studentId;
	private Integer installmentNo;
	private Double amount;
	private String payDate;
	public Payment () {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(String billNumber, String subscriptionId, Integer installmentNo, Double amount, String payDate) {
		super();
		this.billNumber = billNumber;
		this.subscriptionId = subscriptionId;
		this.studentId = studentId;
		this.installmentNo = installmentNo;
		this.amount = amount;
		this.payDate = payDate;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Integer getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(Integer installmentNo) {
		this.installmentNo = installmentNo;
	}
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getpayDate() {
		return payDate;
	}
	public void setpayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setstudentId(String studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Payment [billNumber=" + billNumber + ", subscriptionId=" + subscriptionId + ", studentId=" + studentId
				+ ", installmentNo=" + installmentNo + ", amount=" + amount + ", payDate=" + payDate + "]";
	}
	
	
}