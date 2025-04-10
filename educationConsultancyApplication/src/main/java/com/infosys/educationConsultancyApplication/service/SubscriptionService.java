package com.infosys.educationConsultancyApplication.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class SubscriptionService {
	public String generateEndDate(String date) {
		DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate subDate=LocalDate.parse(date,dateFormat);
		LocalDate endDate=subDate.plusMonths(3);
		return endDate.toString();
	}

}