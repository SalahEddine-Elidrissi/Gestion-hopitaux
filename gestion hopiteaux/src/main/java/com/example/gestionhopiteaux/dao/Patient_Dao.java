package com.example.gestionhopiteaux.dao;

import com.example.gestionhopiteaux.modele.Patient;
import com.example.gestionhopiteaux.modele.Personne;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Patient_Dao extends CrudRepository<Patient, Integer> {
    List<Patient> findAll();
    Patient findById(int id);
    Patient save(Patient p);
    void deleteById(int id);
}
