package com.spring.c.scopes.prototype;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

//@Required can only be used on setters (in setter injection), makes a field required to be set
public class Prescription {
	private int id;
	private String patientName;
	private List<String> medications;

	@Required
	public void setId(int id) {
		this.id = id;
	}

	@Required
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	@Required
	public void setMedications(List<String> medications) {
		this.medications = medications;
	}

	public int getId() {
		return id;
	}

	public String getPatientName() {
		return patientName;
	}

	public List<String> getMedications() {
		return medications;
	}

	@Override
	public String toString() {
		return "Prescription Id: " + this.getId() + "\n" + "Patient Name: " + this.getPatientName() + " \n"
				+ "Medications: " + this.getMedications();
	}

}
