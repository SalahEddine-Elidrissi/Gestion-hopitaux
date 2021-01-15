package com.example.gestionhopiteaux.dao;

import com.example.gestionhopiteaux.modele.Employer;
import com.example.gestionhopiteaux.modele.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Emplyer_Dao  extends CrudRepository<Employer, Integer> {
    List<Employer> findAll();
    Employer findById(int id);
    Employer save(Employer e);
    void deleteById(int id);
}
