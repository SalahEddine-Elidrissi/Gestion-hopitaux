package com.example.gestionhopiteaux.controller;

import com.example.gestionhopiteaux.dao.Administrateur_Dao;
import com.example.gestionhopiteaux.modele.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class Admistrateur_Controler {

    @Autowired
    private Administrateur_Dao dao;

    public Admistrateur_Controler(){

    }
    @GetMapping(value = "/")
    public String home(){
        return "Hello mon mery!";
    }

    @PostMapping("/saveadministrateur")
    public Administrateur saveAdministrateur(@RequestBody Administrateur administrateur) {
        return dao.save(administrateur);
    }

    @GetMapping("/listadministrateur")
    public List<Administrateur> alladministrateur() {
        return  dao.findAll();
    }

    @DeleteMapping("/deleteadministrateur/{id}")
    public void deleteAdministrateur(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @GetMapping("/administrateur/{id}")
    public Administrateur administrateurByID(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @PutMapping("/updateadministrateur/{id}")
    public Administrateur updateadministrateur(@RequestBody Administrateur administrateur, @PathVariable("id") int id) {
        administrateur.setId(id);
        return dao.save(administrateur);
    }
}
