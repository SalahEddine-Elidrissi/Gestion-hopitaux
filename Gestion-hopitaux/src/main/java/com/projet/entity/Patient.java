package com.projet.entity;

public class Patient extends Person {

	private String dateNai;
	private String sexe;
	
	public Patient() {
		super();
	}

	public Patient(String dateNai, String sexe) {
		super();
		this.dateNai = dateNai;
		this.sexe = sexe;
	}

	public String getDateNai() {
		return dateNai;
	}

	public void setDateNai(String dateNai) {
		this.dateNai = dateNai;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Patient [dateNai=" + dateNai + ", sexe=" + sexe + "]";
	}
	
	
	
	
}
