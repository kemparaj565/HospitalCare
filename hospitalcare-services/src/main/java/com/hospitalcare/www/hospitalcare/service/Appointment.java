package com.hospitalcare.www.hospitalcare.service;

import java.sql.Date;

import lombok.Data;

@Data
public class Appointment {
	
	String patientName;
	String doctorName;
	Date appointmentDate;
	Date expireDate;
	
	

}
