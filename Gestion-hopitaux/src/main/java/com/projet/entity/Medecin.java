package com.projet.entity;

public class Medecin extends Person {
	
	private String specialite;

	public Medecin() {
		
	}

	public Medecin(String specialite) {
		super();
		this.specialite = specialite;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "medecin [specialite=" + specialite + "]";
	}
	
	

}
