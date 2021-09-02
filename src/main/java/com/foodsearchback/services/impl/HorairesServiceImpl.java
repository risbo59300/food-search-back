package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsHoraires;
import com.foodsearchback.repository.HorairesRepository;
import com.foodsearchback.services.HorairesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HorairesServiceImpl implements HorairesService {

    @Autowired
    HorairesRepository horairesRepository;

    @Override
    public void add(FsHoraires type) {
        horairesRepository.save(type);
    }

    @Override
    public void delete(FsHoraires type) {
        horairesRepository.delete(type);
    }

    @Override
    public void update(FsHoraires type) {
        horairesRepository.save(type);
    }

    @Override
    public List<FsHoraires> findAll() {
        return horairesRepository.findAll();
    }

    @Override
    public FsHoraires findById(long id) {
        return horairesRepository.findById(id).get();
    }
}
