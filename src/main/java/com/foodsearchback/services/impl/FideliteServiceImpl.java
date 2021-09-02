package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsFidelite;
import com.foodsearchback.repository.FideliteRepository;
import com.foodsearchback.services.FideliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FideliteServiceImpl implements FideliteService {

    @Autowired
    FideliteRepository fideliteRepository;

    @Override
    public void add(FsFidelite type) {
        fideliteRepository.save(type);
    }

    @Override
    public void delete(FsFidelite type) {
        fideliteRepository.delete(type);
    }

    @Override
    public void update(FsFidelite type) {
        fideliteRepository.save(type);
    }

    @Override
    public List<FsFidelite> findAll() {
        return fideliteRepository.findAll();
    }

    @Override
    public FsFidelite findById(long id) {
        return fideliteRepository.findById(id).get();
    }
}
