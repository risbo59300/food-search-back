package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsAdresse;
import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/adresse")
public class AdresseController {

    @Autowired
    AdresseService adresseService;

    @GetMapping("/find")
    public List<FsAdresse> find() {
        return adresseService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsAdresse findById(@PathVariable long id) {
        return adresseService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsAdresse adresse) {
        adresseService.add(adresse);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsAdresse adresse) {
        adresseService.update(adresse);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        adresseService.delete(adresseService.findById(id));
    }
}
