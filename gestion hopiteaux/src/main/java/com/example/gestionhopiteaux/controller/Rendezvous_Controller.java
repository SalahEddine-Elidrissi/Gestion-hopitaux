package com.example.gestionhopiteaux.controller;

import com.example.gestionhopiteaux.dao.Emplyer_Dao;
import com.example.gestionhopiteaux.dao.Rendeezvous_Dao;
import com.example.gestionhopiteaux.modele.Employer;
import com.example.gestionhopiteaux.modele.Rendezvous;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class Rendezvous_Controller {

    @Autowired
    private Rendeezvous_Dao dao;

    public Rendezvous_Controller() {
    }

    @PostMapping("/saverendezvous")
    public Rendezvous saveRendezvous(@RequestBody Rendezvous rendezvous) {
        return dao.save(rendezvous);
    }

    @GetMapping("/listrendezvous")
    public List<Rendezvous> allRendezvous() {
        return  dao.findAll();
    }

    @DeleteMapping("/deleterendezvous/{id}")
    public void deleteRendezvous(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @GetMapping("/rendezvous/{id}")
    public Rendezvous rendezvousByID(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @PutMapping("/updaterendezvous/{id}")
    public Rendezvous updaterendezvous(@RequestBody Rendezvous rendezvous, @PathVariable("id") int id) {
        rendezvous.setId(id);
        return dao.save(rendezvous);
    }
}
