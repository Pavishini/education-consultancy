package com.infosys.educationConsultancyApplication.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.educationConsultancyApplication.bean.Payment;
public interface PaymentRepository extends JpaRepository<Payment, String> {
	@Query("Select max(billNumber) from Payment")
	public String getMaxBillNumber();
	@Query("Select a from Payment a where subscriptionId=?1")
	public List<Payment> getBillBySubscriptionId(String subscriptionId);
	@Query("Select a from Payment a where studentId=?1")
	public List<Payment> getBillByStudentId(String studentId);

}