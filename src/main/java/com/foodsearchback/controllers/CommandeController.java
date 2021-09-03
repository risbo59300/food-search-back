package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsCategPlats;
import com.foodsearchback.entities.FsCommande;
import com.foodsearchback.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/commande")
public class CommandeController {

    @Autowired
    CommandeService commandeService;

    @GetMapping("/find")
    public List<FsCommande> find() {
        return commandeService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsCommande findById(@PathVariable long id) {
        return commandeService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsCommande commande) {
        commandeService.add(commande);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsCommande commande) {
        commandeService.update(commande);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        commandeService.delete(commandeService.findById(id));
    }
}
