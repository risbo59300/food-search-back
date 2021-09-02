package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsCategPlats;
import com.foodsearchback.repository.CategoriePlatRepository;
import com.foodsearchback.services.CategoriePlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoriePlatServiceImpl implements CategoriePlatService {

    @Autowired
    CategoriePlatRepository categoriePlatRepository;

    @Override
    public void add(FsCategPlats type) {
        categoriePlatRepository.save(type);
    }

    @Override
    public void delete(FsCategPlats type) {
        categoriePlatRepository.delete(type);
    }

    @Override
    public void update(FsCategPlats type) {
        categoriePlatRepository.save(type);
    }

    @Override
    public List<FsCategPlats> findAll() {
        return categoriePlatRepository.findAll();
    }

    @Override
    public FsCategPlats findById(long id) {
        return categoriePlatRepository.findById(id).get();
    }
}
