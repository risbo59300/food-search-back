package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsRole;
import com.foodsearchback.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/find")
    public List<FsRole> find() {
        return roleService.findAll();
    }

    @GetMapping("/find/{id}")
    public List<FsRole> findById() {
        return roleService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsRole role) {
        roleService.add(role);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsRole role) {
        roleService.update(role);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        roleService.delete(roleService.findById(id));
    }
}
