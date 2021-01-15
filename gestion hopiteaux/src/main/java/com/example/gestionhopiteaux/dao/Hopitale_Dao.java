package com.example.gestionhopiteaux.dao;

import com.example.gestionhopiteaux.modele.Hopitale;
import com.example.gestionhopiteaux.modele.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Hopitale_Dao extends CrudRepository<Hopitale, Integer> {
    List<Hopitale> findAll();
    Hopitale findById(int id);
    Hopitale save(Hopitale h);
    void deleteById(int id);
}
