package com.infosys.educationConsultancyApplication.dao;

import java.util.List;

import com.infosys.educationConsultancyApplication.bean.CourseSubscription;

public interface CourseSubscriptionDao {
	    public void save(CourseSubscription subscription);
	    public CourseSubscription getSubscriptionById(String id);
	    public List<CourseSubscription> getAllSubscriptions();
	    public List<CourseSubscription> getCurrentSubscriptions();
	    public List<CourseSubscription> getAllSubscriptionsByStudent(String id);
	    public String generateSubscriptionId();

}