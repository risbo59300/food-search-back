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

    @GetMapping("/commande/{id}")
    public List<FsCommande> findById() {
        return commandeService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsCommande commande) {
        commandeService.add(commande);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsCommande commande) {
        commandeService.update(commande);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        commandeService.delete(commandeService.findById(id));
    }
}
