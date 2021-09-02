package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsSpecialite;
import com.foodsearchback.repository.SpecialiteRepository;
import com.foodsearchback.services.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SpecialiteServiceImpl implements SpecialiteService {

    @Autowired
    SpecialiteRepository specialiteRepository;

    @Override
    public void add(FsSpecialite specialite) {
        specialiteRepository.save(specialite);
    }

    @Override
    public void delete(FsSpecialite specialite) {
        specialiteRepository.delete(specialite);
    }

    @Override
    public void update(FsSpecialite specialite) {
        specialiteRepository.save(specialite);
    }

    @Override
    public List<FsSpecialite> findAll() {
        return specialiteRepository.findAll();
    }

    @Override
    public FsSpecialite findById(long id) {
        return specialiteRepository.findById(id).get();
    }
}
