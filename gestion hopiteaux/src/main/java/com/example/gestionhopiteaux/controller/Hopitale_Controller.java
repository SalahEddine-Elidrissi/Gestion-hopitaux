package com.example.gestionhopiteaux.controller;
import com.example.gestionhopiteaux.dao.Hopitale_Dao;
import com.example.gestionhopiteaux.modele.Hopitale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class Hopitale_Controller {

    @Autowired
    private Hopitale_Dao dao;

    public Hopitale_Controller() {

    }

    @PostMapping("/savehopitale")
    public Hopitale saveHopitale(@RequestBody Hopitale hopitale) {
        return dao.save(hopitale);
    }

    @GetMapping("/listhopitale")
    public List<Hopitale> allHopitale() {
        return  dao.findAll();
    }

    @DeleteMapping("/deletehopitale/{id}")
    public void deletehopitale(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @GetMapping("/hopitale/{id}")
    public Hopitale hopitaleByID(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @PutMapping("/updatehopitale/{id}")
    public Hopitale updateHopitale(@RequestBody Hopitale hopitale, @PathVariable("id") int id) {
        hopitale.setId(id);
        return dao.save(hopitale);
    }
}
