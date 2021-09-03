package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsUtilisateur;
import com.foodsearchback.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/utilisateur")
public class UtilisateurController {

    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping("/find")
    public List<FsUtilisateur> find() {
        return utilisateurService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsUtilisateur findById(@PathVariable long id) {
        return utilisateurService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsUtilisateur utilisateur) {
        utilisateurService.add(utilisateur);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsUtilisateur utilisateur) {
        utilisateurService.update(utilisateur);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        utilisateurService.delete(utilisateurService.findById(id));
    }
}
