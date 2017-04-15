package com.bridgelabz.programs;

public class Doctor {
	String name;
	int id;
	String specilization;
	String availability;

	public Doctor(String name, int id, String specilization, String availability) {

		this.name = name;
		this.id = id;
		this.specilization = specilization;
		this.availability = availability;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
