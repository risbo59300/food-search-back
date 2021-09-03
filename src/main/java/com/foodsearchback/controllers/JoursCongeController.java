package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsJoursConges;
import com.foodsearchback.services.JoursCongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/joursConge")
public class JoursCongeController {

    @Autowired
    JoursCongeService joursCongeService;

    @GetMapping("/find")
    public List<FsJoursConges> find() {
        return joursCongeService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsJoursConges findById(@PathVariable long id) {
        return joursCongeService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsJoursConges joursConges) {
        joursCongeService.add(joursConges);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsJoursConges joursConges) {
        joursCongeService.update(joursConges);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        joursCongeService.delete(joursCongeService.findById(id));
    }

}
