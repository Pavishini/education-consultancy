package com.infosys.educationConsultancyApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infosys.educationConsultancyApplication.bean.CourseSubscription;

public interface CourseSubscriptionRepository extends JpaRepository<CourseSubscription, String> {
	
	@Query("SELECT max(subscriptionId) from CourseSubscription")
	public String getMaxId();

	@Query("select a from CourseSubscription a where status='true'")
	public List<CourseSubscription> getCurrentSubscriptions();
	@Query("select a from CourseSubscription a where studentId=?1")
	public List<CourseSubscription>getAllSubscriptionsByStudentId(String studentId );

}