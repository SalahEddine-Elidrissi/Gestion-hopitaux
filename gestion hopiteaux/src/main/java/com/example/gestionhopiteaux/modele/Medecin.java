package com.example.gestionhopiteaux.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("M")
public class Medecin extends Personne {
    public String specialite;

    public Medecin() {

    }

    public Medecin(int id, String nom, String perenom, String tel, String adresse, String email, String motdepasse, String specialite) {
        super(id, nom, perenom, tel, adresse, email, motdepasse);
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
        return "Medecin{" +
                "specialite='" + specialite + '\'' +
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
