package com.example.gestionhopiteaux.dao;

import com.example.gestionhopiteaux.modele.Administrateur;
import com.example.gestionhopiteaux.modele.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Administrateur_Dao extends CrudRepository<Administrateur, Integer> {
    List<Administrateur> findAll();
    Administrateur findById(int id);
    Administrateur save(Administrateur a);
    void deleteById(int id);
}
