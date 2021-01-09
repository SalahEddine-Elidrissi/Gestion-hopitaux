package com.example.gestionhopiteaux.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  int id;

    public Date dater;
    public  String  heure;

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
