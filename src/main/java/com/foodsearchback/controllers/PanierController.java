package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsPanier;
import com.foodsearchback.services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/panier")
public class PanierController {

    @Autowired
    PanierService panierService;

    @GetMapping("/find")
    public List<FsPanier> find() {
        return panierService.findAll();
    }

    @GetMapping("/find/{id}")
    public List<FsPanier> findById() {
        return panierService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsPanier panier) {
        panierService.add(panier);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsPanier panier) {
        panierService.update(panier);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        panierService.delete(panierService.findById(id));
    }
}
