package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsAdresse;
import com.foodsearchback.repository.AdresseRepository;
import com.foodsearchback.services.AdresseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class AdresseServiceImpl implements AdresseService {

    @Autowired
    AdresseRepository adresseRepository;

    @Override
    public void add(FsAdresse type) {
        adresseRepository.save(type);
    }

    @Override
    public void delete(FsAdresse type) {
        adresseRepository.delete(type);
    }

    @Override
    public void update(FsAdresse type) {
        adresseRepository.save(type);
    }

    @Override
    public List<FsAdresse> findAll() {
        return adresseRepository.findAll();
    }

    @Override
    public FsAdresse findById(long id) {
        return adresseRepository.findById(id).get();
    }
}
