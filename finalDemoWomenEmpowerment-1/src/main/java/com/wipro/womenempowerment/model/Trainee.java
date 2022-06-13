package com.wipro.womenempowerment.model;

import javax.persistence.*;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String traineeName;
	
	private String traineeField;
	
	private int traineeExperience;
	
	private int traineeNumber;

	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(String traineeName, String traineeField, int traineeExperience, int traineeNumber) {
		this.traineeName = traineeName;
		this.traineeField = traineeField;
		this.traineeExperience = traineeExperience;
		this.traineeNumber = traineeNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeField() {
		return traineeField;
	}

	public void setTraineeField(String traineeField) {
		this.traineeField = traineeField;
	}

	public int getTraineeExperience() {
		return traineeExperience;
	}

	public void setTraineeExperience(int traineeExperience) {
		this.traineeExperience = traineeExperience;
	}

	public int getTraineeNumber() {
		return traineeNumber;
	}

	public void setTraineeNumber(int traineeNumber) {
		this.traineeNumber = traineeNumber;
	}

}
