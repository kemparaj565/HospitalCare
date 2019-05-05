package com.hospitalcare.www.hospitalcare.rest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff")
public class StaffResource {
	
	@RequestMapping("/name")
	public String getStaffDetails() {
		System.out.println("Staff name is returned");
		return "Staff name";
	}

}
