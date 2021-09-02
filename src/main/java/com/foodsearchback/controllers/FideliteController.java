package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsFidelite;
import com.foodsearchback.services.FideliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/fidelite")
public class FideliteController {

    @Autowired
    FideliteService fideliteService;

    @GetMapping("/find")
    public List<FsFidelite> find() {
        return fideliteService.findAll();
    }

    @GetMapping("/specialite/{id}")
    public List<FsFidelite> findById() {
        return fideliteService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsFidelite fidelite) {
        fideliteService.add(fidelite);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsFidelite fidelite) {
        fideliteService.update(fidelite);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        fideliteService.delete(fideliteService.findById(id));
    }
}
