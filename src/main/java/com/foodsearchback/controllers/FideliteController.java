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

    @GetMapping("/find/{id}")
    public FsFidelite findById(@PathVariable long id) {
        return fideliteService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsFidelite fidelite) {
        fideliteService.add(fidelite);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsFidelite fidelite) {
        fideliteService.update(fidelite);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        fideliteService.delete(fideliteService.findById(id));
    }
}
