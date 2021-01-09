package com.example.gestionhopiteaux.modele;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Hopitale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String loaclisation;
    public String region;
    @ManyToOne
    @JoinColumn(name = "administrateur_id",nullable = false)
    private Administrateur administrateur;


    public Hopitale(int id, String loaclisation, String region, Administrateur administrateur) {
        this.id = id;
        this.loaclisation = loaclisation;
        this.region = region;
        this.administrateur = administrateur;
    }

    public Hopitale() {
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaclisation() {
        return loaclisation;
    }

    public void setLoaclisation(String loaclisation) {
        this.loaclisation = loaclisation;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Hopitale{" +
                "id=" + id +
                ", loaclisation='" + loaclisation + '\'' +
                ", region='" + region + '\'' +
                ", Administrateur=" + administrateur +
                '}';
    }
}
