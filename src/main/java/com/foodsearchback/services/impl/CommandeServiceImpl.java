package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsCommande;
import com.foodsearchback.repository.CommandeRepository;
import com.foodsearchback.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    CommandeRepository commandeRepository;

    @Override
    public void add(FsCommande type) {
        commandeRepository.save(type);
    }

    @Override
    public void delete(FsCommande type) {
        commandeRepository.delete(type);
    }

    @Override
    public void update(FsCommande type) {
        commandeRepository.save(type);
    }

    @Override
    public List<FsCommande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public FsCommande findById(long id) {
        return commandeRepository.findById(id).get();
    }
}
