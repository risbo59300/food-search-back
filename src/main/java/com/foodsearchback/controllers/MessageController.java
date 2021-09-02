package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsMessage;
import com.foodsearchback.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/find")
    public List<FsMessage> find() {
        return messageService.findAll();
    }

    @GetMapping("/specialite/{id}")
    public List<FsMessage> findById() {
        return messageService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsMessage message) {
        messageService.add(message);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsMessage message) {
        messageService.update(message);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        messageService.delete(messageService.findById(id));
    }

}
