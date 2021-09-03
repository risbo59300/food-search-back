package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsRestaurant;
import com.foodsearchback.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/find")
    public List<FsRestaurant> find() {
        return restaurantService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsRestaurant findById(@PathVariable long id) {
        return restaurantService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsRestaurant restaurant) {
        restaurantService.add(restaurant);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsRestaurant restaurant) {
        restaurantService.update(restaurant);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        restaurantService.delete(restaurantService.findById(id));
    }
}
