package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsFavoris;
import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.services.FavorisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/favoris")
public class FavorisController {

    @Autowired
    FavorisService favorisService;

    @GetMapping("/find")
    public List<FsFavoris> find() {
        return favorisService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsFavoris findById(@PathVariable long id) {
        return favorisService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsFavoris favoris) {
        favorisService.add(favoris);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsFavoris favoris) {
        favorisService.update(favoris);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) { favorisService.delete(favorisService.findById(id));
    }
}
