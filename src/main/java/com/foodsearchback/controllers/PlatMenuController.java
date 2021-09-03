package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsPlatMenu;
import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.services.PlatMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins = "http://localhost:4200")
@RequestMapping("/platMenu")
public class PlatMenuController {

    @Autowired
    PlatMenuService platMenuService;

    @GetMapping("/find")
    public List<FsPlatMenu> find() {
        return platMenuService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsPlatMenu findById(@PathVariable long id) { return platMenuService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsPlatMenu platMenu) {
        platMenuService.add(platMenu);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsPlatMenu platMenu) { platMenuService.update(platMenu);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        platMenuService.delete(platMenuService.findById(id));
    }
}
