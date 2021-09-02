package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsReport;
import com.foodsearchback.repository.ReportRepository;
import com.foodsearchback.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReportServiceImpl implements ReportService {

    @Autowired
    ReportRepository reportRepository;

    @Override
    public void add(FsReport type) {
        reportRepository.save(type);
    }

    @Override
    public void delete(FsReport type) {
        reportRepository.delete(type);
    }

    @Override
    public void update(FsReport type) {
        reportRepository.save(type);
    }

    @Override
    public List<FsReport> findAll() {
        return reportRepository.findAll();
    }

    @Override
    public FsReport findById(long id) {
        return reportRepository.findById(id).get();
    }
}
