package com.example.gestionhopiteaux.controller;

import com.example.gestionhopiteaux.dao.Emplyer_Dao;
import com.example.gestionhopiteaux.dao.Medecin_Dao;
import com.example.gestionhopiteaux.modele.Employer;
import com.example.gestionhopiteaux.modele.Medecin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")

public class Medecin_Controller {
    @Autowired
    private Medecin_Dao dao;

    public Medecin_Controller() {
    }


    @PostMapping("/savemedecin")
    public Medecin saveMedecin(@RequestBody Medecin medecin) {
        return dao.save(medecin);
    }

    @GetMapping("/listmedecin")
    public List<Medecin> allMedecin() {
        return  dao.findAll();
    }

    @DeleteMapping("/deletemedecin/{id}")
    public void deleteMedecin(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @GetMapping("/medecin/{id}")
    public Medecin medecinByID(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @PutMapping("/updatemedecin/{id}")
    public Medecin updatemedecin(@RequestBody Medecin medecin, @PathVariable("id") int id) {
        medecin.setId(id);
        return dao.save(medecin);
    }
}

