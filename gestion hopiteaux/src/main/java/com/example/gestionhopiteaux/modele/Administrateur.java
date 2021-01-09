package com.example.gestionhopiteaux.modele;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.*;

@Entity
public class Administrateur extends Personne {
    @OneToMany(fetch = FetchType.LAZY,mappedBy ="administrateur")
    private List<Hopitale> hopitales;
    public Administrateur() {
    }

    public Administrateur(int id, String nom, String prenom, String tel, String adresse, String email, String motdepasse) {
        super(id, nom, prenom, tel, adresse, email, motdepasse);
    }

}
