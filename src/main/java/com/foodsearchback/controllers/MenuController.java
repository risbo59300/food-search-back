package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsMenu;
import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("/find")
    public List<FsMenu> find() {
        return menuService.findAll();
    }

    @GetMapping("/menu/{id}")
    public List<FsMenu> findById() {
        return menuService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsMenu menu) {
        menuService.add(menu);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsMenu menu) {
        menuService.update(menu);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        menuService.delete(menuService.findById(id));
    }
}
