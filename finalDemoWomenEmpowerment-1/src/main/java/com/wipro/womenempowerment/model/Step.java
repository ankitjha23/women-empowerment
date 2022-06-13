package com.wipro.womenempowerment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Step {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String fName;
	
	private String lName;
	
	private String fatherName;
	
	private String motherName;
	
	private String phoneNumber;
	
	private String adharcardNumber;
	
	private String trainingCourse;
	
	public Step() {
		super();
	}

	public Step(String fName, String lName, String fatherName, String motherName, String phoneNumber,
			String adharcardNumber, String trainingCourse) {
		this.fName = fName;
		this.lName = lName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.phoneNumber = phoneNumber;
		this.adharcardNumber = adharcardNumber;
		this.trainingCourse = trainingCourse;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdharcardNumber() {
		return adharcardNumber;
	}

	public void setAdharcardNumber(String adharcardNumber) {
		this.adharcardNumber = adharcardNumber;
	}

	public String getTrainingCourse() {
		return trainingCourse;
	}

	public void setTrainingCourse(String trainingCourse) {
		this.trainingCourse = trainingCourse;
	}
	
}
