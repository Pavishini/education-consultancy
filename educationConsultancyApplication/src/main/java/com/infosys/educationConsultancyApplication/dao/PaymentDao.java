package com.infosys.educationConsultancyApplication.dao;
import java.util.List;

import com.infosys.educationConsultancyApplication.bean.Payment;
public interface PaymentDao {
	public void save(Payment Payment);
	public Payment getPaymentByBill(String billNumber);
	public List<Payment> getAllBills();
	List<Payment> getBillBySubscriptionId(String subscriptionId);
	public List<Payment> getBillByStudentId(String studentId);
	public String generateBillNumber();

}
