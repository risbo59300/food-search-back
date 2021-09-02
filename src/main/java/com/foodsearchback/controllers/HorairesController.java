package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsFidelite;
import com.foodsearchback.entities.FsHoraires;
import com.foodsearchback.services.HorairesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/horaires")
public class HorairesController {

    @Autowired
    HorairesService horairesService;

    @GetMapping("/find")
    public List<FsHoraires> find() {
        return horairesService.findAll();
    }

    @GetMapping("/specialite/{id}")
    public List<FsHoraires> findById() {
        return horairesService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsHoraires horaires) {
        horairesService.add(horaires);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsHoraires horaires) {
        horairesService.update(horaires);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        horairesService.delete(horairesService.findById(id));
    }
}
