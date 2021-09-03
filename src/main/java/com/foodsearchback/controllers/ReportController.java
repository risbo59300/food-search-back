package com.foodsearchback.controllers;

import com.foodsearchback.entities.FsReport;
import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin( origins = "http://localhost:4200")
@RequestMapping("/report")
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping("/find")
    public List<FsReport> find() {
        return reportService.findAll();
    }

    @GetMapping("/find/{id}")
    public FsReport findById(@PathVariable long id) {
        return reportService.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody FsReport report) {
        reportService.add(report);
    }

    @PutMapping("/update")
    public void update(@RequestBody FsReport report) {
        reportService.update(report);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        reportService.delete(reportService.findById(id));
    }
}
