package com.example.gestionhopiteaux.modele;

import javax.persistence.*;
import java.util.List;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String nomservice;

    @OneToMany(fetch = FetchType.LAZY,mappedBy ="service")
    private List<Medecin> medecin;

    @OneToMany(fetch = FetchType.LAZY,mappedBy ="service")
    private List<Rendezvous> rendezvous;



    public Service(List<Rendezvous> rendezvous) {
        this.rendezvous = rendezvous;
    }

    public Service() {
    }

    public Service(int id, String nomservice) {
        this.id = id;
        this.nomservice = nomservice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomservice() {
        return nomservice;
    }

    public void setNomservice(String nomservice) {
        this.nomservice = nomservice;
    }

    public List<Medecin> getMedecin() {
        return medecin;
    }

    public void setMedecin(List<Medecin> medecin) {
        this.medecin = medecin;
    }

    public List<Rendezvous> getRendezvous() {
        return rendezvous;
    }

    public void setRendezvous(List<Rendezvous> rendezvous) {
        this.rendezvous = rendezvous;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", nomservice='" + nomservice + '\'' +
                ", medecin=" + medecin +
                ", rendezvous=" + rendezvous +
                '}';
    }
}
