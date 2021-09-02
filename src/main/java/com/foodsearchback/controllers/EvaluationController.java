package com.foodsearchback.controllers;


import com.foodsearchback.entities.FsEvaluation;
import com.foodsearchback.services.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/evaluation")
public class EvaluationController {

    @Autowired
    EvaluationService evaluationService;

    @GetMapping("/find")
    public List<FsEvaluation> find() {
        return evaluationService.findAll();
    }

    @GetMapping("/specialite/{id}")
    public List<FsEvaluation> findById() {
        return evaluationService.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody FsEvaluation evaluation) {
        evaluationService.add(evaluation);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsEvaluation evaluation) {
        evaluationService.update(evaluation);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable long id) {
        evaluationService.delete(evaluationService.findById(id));
    }
}
