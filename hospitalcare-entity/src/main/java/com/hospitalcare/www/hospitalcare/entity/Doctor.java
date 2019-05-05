package com.hospitalcare.www.hospitalcare.entity;

public class Doctor {
	
	String doctorName;
	String doctorID;
	String doctorAddress;
	String doctorEmailId;
	Long doctorTelephoneNumber;
	String doctorQualification;
	String doctorExpertise;
	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorAddress() {
		return doctorAddress;
	}
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	public String getDoctorEmailId() {
		return doctorEmailId;
	}
	public void setDoctorEmailId(String doctorEmailId) {
		this.doctorEmailId = doctorEmailId;
	}
	public Long getDoctorTelephoneNumber() {
		return doctorTelephoneNumber;
	}
	public void setDoctorTelephoneNumber(Long doctorTelephoneNumber) {
		this.doctorTelephoneNumber = doctorTelephoneNumber;
	}
	public String getDoctorQualification() {
		return doctorQualification;
	}
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}
	public String getDoctorExpertise() {
		return doctorExpertise;
	}
	public void setDoctorExpertise(String doctorExpertise) {
		this.doctorExpertise = doctorExpertise;
	}
	
	

}
