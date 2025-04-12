package com.infosys.educationConsultancyApplication.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infosys.educationConsultancyApplication.bean.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {

    @Autowired
    private PaymentRepository repository;

    @Override
    public void save(Payment payment) {
        repository.save(payment);
    }

    @Override
    public Payment getPaymentByBill(String billNumber) {
        Optional<Payment> payment = repository.findById(billNumber);
        return payment.orElse(null);  // Return null or throw an exception based on your business logic
    }

    @Override
    public List<Payment> getAllBills() {
        return repository.findAll();
    }

    @Override
    public List<Payment> getBillBySubscriptionId(String subscriptionId) {
        return repository.getBillBySubscriptionId(subscriptionId);
    }

    @Override
    public List<Payment> getBillByStudentId(String studentId) {
        return repository.getBillByStudentId(studentId);
    }

    @Override
    public String generateBillNumber() {
        Long id = 0L;
        String val = repository.getMaxBillNumber();  // Ensure repository has this method implemented
        if (val == null) {
            id = 1000001L;
        } else {
            id = Long.parseLong(val.substring(2)) + 1;
        }
        return "BL" + id;
    }
}