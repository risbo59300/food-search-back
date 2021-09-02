package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsPlatsRestaurant;
import com.foodsearchback.services.PlatsRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/platsRestaurant")
public class PlatsRestaurantController {

    @Autowired
    PlatsRestaurantService platsRestaurantService;

    @GetMapping("/find")
    public List<FsPlatsRestaurant> find() {
        return platsRestaurantService.findAll();
    }

    @GetMapping("/find/{id}")
    public List<FsPlatsRestaurant> findById() {
        return platsRestaurantService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsPlatsRestaurant platsRestaurant) {
        platsRestaurantService.add(platsRestaurant);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsPlatsRestaurant platsRestaurant) {
        platsRestaurantService.update(platsRestaurant);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        platsRestaurantService.delete(platsRestaurantService.findById(id));
    }
}
