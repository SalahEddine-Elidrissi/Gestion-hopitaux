package com.example.gestionhopiteaux.dao;

import com.example.gestionhopiteaux.modele.Medecin;
import com.example.gestionhopiteaux.modele.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Medecin_Dao extends CrudRepository<Medecin, Integer> {
    List<Medecin> findAll();
    Medecin findById(int id);
    Medecin save(Medecin m);
    void deleteById(int id);
}
