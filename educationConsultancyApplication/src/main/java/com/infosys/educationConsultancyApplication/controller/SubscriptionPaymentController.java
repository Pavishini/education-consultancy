package com.infosys.educationConsultancyApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.educationConsultancyApplication.bean.CourseSubscription;
import com.infosys.educationConsultancyApplication.bean.Payment;
import com.infosys.educationConsultancyApplication.bean.Student;
import com.infosys.educationConsultancyApplication.dao.CourseSubscriptionDao;
import com.infosys.educationConsultancyApplication.dao.PaymentDao;
import com.infosys.educationConsultancyApplication.dao.StudentDao;
import com.infosys.educationConsultancyApplication.service.EduconUserService;
import com.infosys.educationConsultancyApplication.service.SubscriptionService;

@RestController
@RequestMapping("/edu-con/")
@CrossOrigin(origins = "http://localhost:3636")
public class SubscriptionPaymentController {
	@Autowired
	private CourseSubscriptionDao courseSubscriptionDao;
	
	@Autowired
	private EduconUserService service;
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private SubscriptionService subService;
	
	@Autowired
	private PaymentDao paymentDao;
	
	@PostMapping("/subscription")
	public void save(@RequestBody CourseSubscription subscription) {
		String userId=service.getUserId();
		Student student=studentDao.getStudentByUsername(userId);
		subscription.setStudentId(student.getRegistrationNumber());
		String endDate=subService.generateEndDate(subscription.getSubscriptionDate());
		subscription.setEndDate(endDate);
		subscription.setStatus("active");
		courseSubscriptionDao.save(subscription);
	}
	@PutMapping("/subscription")
	public void update(@RequestBody CourseSubscription subscription) {
		courseSubscriptionDao.save(subscription);
	}
	@GetMapping("/subscription/{id}")
    public CourseSubscription getSubscriptionById(@PathVariable String id) {
		return courseSubscriptionDao.getSubscriptionById(id);
	}
	@GetMapping("/subscription")
    public List<CourseSubscription> getAllSubscriptions(){
		return courseSubscriptionDao.getAllSubscriptions();
	}
	@GetMapping("/subscription-current")
    public List<CourseSubscription> getCurrentSubscriptions(){
		return courseSubscriptionDao.getCurrentSubscriptions();
	}
	@GetMapping("/subscription-stud/{id}")
	public List<CourseSubscription> getAllSubscriptionsByStudent(@PathVariable String id){
		return courseSubscriptionDao.getAllSubscriptionsByStudent(id);
	}
	@GetMapping("/subscription-stud")
    public List<CourseSubscription> getAllSubscriptionsByStudent(){
		String userId=service.getUserId();
		Student student=studentDao.getStudentByUsername(userId);
		return courseSubscriptionDao.getAllSubscriptionsByStudent(student.getRegistrationNumber());
	}
	@GetMapping("/subscription-id")
    public String generateSubscriptionId() {
		return courseSubscriptionDao.generateSubscriptionId();
	}
	
	@PostMapping("/payment")
    public void savePayment(@RequestBody Payment payment) {
    	String userId=service.getUserId();
    	Student student=studentDao.getStudentByUsername(userId);
    	payment.setstudentId(student.getRegistrationNumber());
    	paymentDao.save(payment);
    }
    
    @GetMapping("/payment/{id}")
    public Payment getPaymentByBill(@PathVariable String id) {
    	return paymentDao.getPaymentByBill(id);
    }
    @GetMapping("/payment")
    public List<Payment>getAllBills(){
    	return paymentDao.getAllBills();
    }
    
    @GetMapping("/payment-sub/{id}")
    List<Payment>getBillBySubscriptionId(@PathVariable String id){
    	return paymentDao.getBillBySubscriptionId(id);
    }
    
    
    @GetMapping("/payment-sub")
    	public List<Payment> getBillByStudentId(){
    		String userId=service.getUserId();
    		Student student=studentDao.getStudentByUsername(userId);
    		return paymentDao.getBillByStudentId(student.getRegistrationNumber());
    	}
    	@GetMapping("/payment-id")
    	public String generateBillNumber() {
    		return paymentDao.generateBillNumber();
    	}

	
	
}