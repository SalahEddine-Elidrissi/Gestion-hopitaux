package com.example.gestionhopiteaux.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("E")
public class Employer extends  Personne{
    public Employer() {
    }

    public Employer(int id, String nom, String perenom, String tel, String adresse, String email, String motdepasse) {
        super(id, nom, perenom, tel, adresse, email, motdepasse);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", perenom='" + perenom + '\'' +
                ", tel='" + tel + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                '}';
    }
}
