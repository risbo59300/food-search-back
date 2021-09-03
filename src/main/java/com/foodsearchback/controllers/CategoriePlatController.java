package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsCategPlats;
import com.foodsearchback.services.CategoriePlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categoriePlat")
public class CategoriePlatController {

    @Autowired
    CategoriePlatService categoriePlatService;

    @GetMapping("/find")
    public List<FsCategPlats> find() {
        return categoriePlatService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsCategPlats findById(@PathVariable long id) {
        return categoriePlatService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsCategPlats categPlats) {
        categoriePlatService.add(categPlats);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsCategPlats categPlats) {
        categoriePlatService.update(categPlats);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        categoriePlatService.delete(categoriePlatService.findById(id));
    }
}
