package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsPanier;
import com.foodsearchback.repository.PanierRepository;
import com.foodsearchback.services.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PanierServiceImpl implements PanierService {

    @Autowired
    PanierRepository panierRepository;

    @Override
    public void add(FsPanier type) {
        panierRepository.save(type);
    }

    @Override
    public void delete(FsPanier type) {
        panierRepository.delete(type);
    }

    @Override
    public void update(FsPanier type) {
        panierRepository.save(type);
    }

    @Override
    public List<FsPanier> findAll() {
        return panierRepository.findAll();
    }

    @Override
    public FsPanier findById(long id) {
        return panierRepository.findById(id).get();
    }
}
