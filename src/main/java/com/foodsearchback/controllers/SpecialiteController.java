package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.services.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/specialite")
public class SpecialiteController {

    @Autowired
    SpecialiteService specialiteService;

    @GetMapping("/find")
    public List<FsSpecialite> find() {
        return specialiteService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsSpecialite findById(@PathVariable long id) {
        return specialiteService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsSpecialite specialite) {
        specialiteService.add(specialite);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsSpecialite specialite) {
        specialiteService.update(specialite);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        specialiteService.delete(specialiteService.findById(id));
    }


}
