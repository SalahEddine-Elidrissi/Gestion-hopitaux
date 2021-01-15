package com.example.gestionhopiteaux.modele;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
//@DiscriminatorValue("M")
public class Medecin extends Personne {
    public String specialite;
    @ManyToOne
    @JoinColumn(name = "service_id",nullable = false)
    private Service service;

    public Medecin() {

    }



    public Medecin(int id, String nom, String perenom, String tel, String adresse, String email, String motdepasse, String specialite, Service service) {
        super(id, nom, perenom, tel, adresse, email, motdepasse);
        this.specialite = specialite;
        this.service = service;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
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
                ", service=" + service +
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
