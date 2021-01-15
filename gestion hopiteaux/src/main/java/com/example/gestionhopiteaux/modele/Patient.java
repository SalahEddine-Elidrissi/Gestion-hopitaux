package com.example.gestionhopiteaux.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
//@DiscriminatorValue("P")
public class Patient extends Personne {
    public String datenaissance;
    public String sexe_patient;
    @OneToMany(fetch = FetchType.LAZY,mappedBy ="patient")
    private List<Rendezvous> rendezvous;

    public Patient() {

    }

    public Patient(int id, String nom, String perenom, String tel, String adresse, String email, String motdepasse, String datenaissance) {
        super(id, nom, perenom, tel, adresse, email, motdepasse);
        this.datenaissance = datenaissance;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getSexe_patient() {
        return sexe_patient;
    }

    public void setSexe_patient(String sexe_patient) {
        this.sexe_patient = sexe_patient;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "datenaissance='" + datenaissance + '\'' +
                ", sexe_patient='" + sexe_patient + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", perenom='" + perenom + '\'' +
                ", tel='" + tel + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                '}';
    }
}
