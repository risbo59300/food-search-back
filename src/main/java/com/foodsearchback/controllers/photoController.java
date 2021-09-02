package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsPhoto;
import com.foodsearchback.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/photo")
public class photoController {

    @Autowired
    PhotoService photoService;

    @GetMapping("/find")
    public List<FsPhoto> find() {
        return photoService.findAll();
    }

    @GetMapping("/specialite/{id}")
    public List<FsPhoto> findById() {
        return photoService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsPhoto photo) {
        photoService.add(photo);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsPhoto photo) {
        photoService.update(photo);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        photoService.delete(photoService.findById(id));
    }
}
