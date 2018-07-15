package com.hospitalcare.www.hospitalcare.beans;

public class Patient {
	
	String patientName;
	String patientID;
	String patientEmailId;
	Long patientTelephoneNumber;
	String patientGuardian;
	
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientEmailId() {
		return patientEmailId;
	}
	public void setPatientEmailId(String patientEmailId) {
		this.patientEmailId = patientEmailId;
	}
	public Long getPatientTelephoneNumber() {
		return patientTelephoneNumber;
	}
	public void setPatientTelephoneNumber(Long patientTelephoneNumber) {
		this.patientTelephoneNumber = patientTelephoneNumber;
	}
	public String getPatientGuardian() {
		return patientGuardian;
	}
	public void setPatientGuardian(String patientGuardian) {
		this.patientGuardian = patientGuardian;
	}
	

	
	
}
