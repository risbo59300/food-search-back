package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsFavoris;
import com.foodsearchback.repository.FavorisRepository;
import com.foodsearchback.services.FavorisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FavorisServiceImpl implements FavorisService {

    @Autowired
    FavorisRepository favorisRepository;

    @Override
    public void add(FsFavoris type) {
        favorisRepository.save(type);
    }

    @Override
    public void delete(FsFavoris type) {
        favorisRepository.delete(type);
    }

    @Override
    public void update(FsFavoris type) {
        favorisRepository.save(type);
    }

    @Override
    public List<FsFavoris> findAll() {
        return favorisRepository.findAll();
    }

    @Override
    public FsFavoris findById(long id) {
        return favorisRepository.findById(id).get();
    }
}
