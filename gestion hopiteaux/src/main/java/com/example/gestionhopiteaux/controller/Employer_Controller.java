package com.example.gestionhopiteaux.controller;

import com.example.gestionhopiteaux.dao.Administrateur_Dao;
import com.example.gestionhopiteaux.dao.Emplyer_Dao;
import com.example.gestionhopiteaux.modele.Administrateur;
import com.example.gestionhopiteaux.modele.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class Employer_Controller {

    @Autowired
    private Emplyer_Dao dao;

    public Employer_Controller() {
    }


    @PostMapping("/saveemployer")
    public Employer saveEmployer(@RequestBody Employer employer) {
        return dao.save(employer);
    }

    @GetMapping("/listemployer")
    public List<Employer> allEmployer() {
        return  dao.findAll();
    }

    @DeleteMapping("/deleteemployer/{id}")
    public void deleteEmployer(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @GetMapping("/employer/{id}")
    public Employer employerByID(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @PutMapping("/updateemployer/{id}")
    public Employer updateemployer(@RequestBody Employer employer, @PathVariable("id") int id) {
        employer.setId(id);
        return dao.save(employer);
    }
}
