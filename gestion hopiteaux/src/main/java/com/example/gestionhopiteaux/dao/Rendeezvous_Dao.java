package com.example.gestionhopiteaux.dao;

import com.example.gestionhopiteaux.modele.Administrateur;
import com.example.gestionhopiteaux.modele.Rendezvous;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Rendeezvous_Dao extends CrudRepository<Rendezvous, Integer> {
    List<Rendezvous> findAll();
    Rendezvous findById(int id);
    Rendezvous save(Rendezvous r);
    void deleteById(int id);
}
