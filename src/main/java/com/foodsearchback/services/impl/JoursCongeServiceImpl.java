package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsJoursConges;
import com.foodsearchback.repository.JoursCongeRepository;
import com.foodsearchback.services.JoursCongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JoursCongeServiceImpl implements JoursCongeService {

    @Autowired
    JoursCongeRepository joursCongeRepository;

    @Override
    public void add(FsJoursConges type) {
        joursCongeRepository.save(type);
    }

    @Override
    public void delete(FsJoursConges type) {
        joursCongeRepository.delete(type);
    }

    @Override
    public void update(FsJoursConges type) {
        joursCongeRepository.save(type);
    }

    @Override
    public List<FsJoursConges> findAll() {
        return joursCongeRepository.findAll();
    }

    @Override
    public FsJoursConges findById(long id) {
        return joursCongeRepository.findById(id).get();
    }
}
