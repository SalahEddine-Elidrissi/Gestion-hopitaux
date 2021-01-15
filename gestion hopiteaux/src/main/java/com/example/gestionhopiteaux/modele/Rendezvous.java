package com.example.gestionhopiteaux.modele;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  int id;
    public Date dater;
    public  String  heure;
    @ManyToOne
    @JoinColumn(name = "patient_id",nullable = false)
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "service_id",nullable = false)
    private Service service;


    public Rendezvous(int id, Date dater, String heure) {
        this.id = id;
        this.dater = dater;
        this.heure = heure;
    }


    public Rendezvous() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDater() {
        return dater;
    }

    public void setDater(Date dater) {
        this.dater = dater;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    @Override
    public String toString() {
        return "Rendezvous{" +
                "id=" + id +
                ", dater=" + dater +
                ", heure='" + heure + '\'' +
                '}';
    }
}
