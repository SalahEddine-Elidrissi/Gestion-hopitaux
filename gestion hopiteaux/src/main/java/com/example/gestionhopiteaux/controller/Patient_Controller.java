package com.example.gestionhopiteaux.controller;

import com.example.gestionhopiteaux.dao.Emplyer_Dao;
import com.example.gestionhopiteaux.dao.Patient_Dao;
import com.example.gestionhopiteaux.modele.Employer;
import com.example.gestionhopiteaux.modele.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class Patient_Controller {
    @Autowired
    private Patient_Dao dao;

    public Patient_Controller() {
    }

    @PostMapping("/savepatiennt")
    public Patient savePatient(@RequestBody Patient patient) {
        return dao.save(patient);
    }

    @GetMapping("/listpatient")
    public List<Patient> allPatient() {
        return  dao.findAll();
    }

    @DeleteMapping("/deletepatient/{id}")
    public void deletePatient(@PathVariable("id") int id) {
        dao.deleteById(id);
    }

    @GetMapping("/patient/{id}")
    public Patient patientByID(@PathVariable("id") int id) {
        return dao.findById(id);
    }

    @PutMapping("/updatepatient/{id}")
    public Patient updatepatient(@RequestBody Patient patient, @PathVariable("id") int id) {
        patient.setId(id);
        return dao.save(patient);
    }
}
