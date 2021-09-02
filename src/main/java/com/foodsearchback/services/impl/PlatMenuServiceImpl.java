package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsPlatMenu;
import com.foodsearchback.repository.PlatMenuRepository;
import com.foodsearchback.services.PlatMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PlatMenuServiceImpl implements PlatMenuService {

    @Autowired
    PlatMenuRepository platMenuRepository;

    @Override
    public void add(FsPlatMenu type) {
        platMenuRepository.save(type);
    }

    @Override
    public void delete(FsPlatMenu type) {
        platMenuRepository.delete(type);
    }

    @Override
    public void update(FsPlatMenu type) {
        platMenuRepository.save(type);
    }

    @Override
    public List<FsPlatMenu> findAll() {
        return platMenuRepository.findAll();
    }

    @Override
    public FsPlatMenu findById(long id) {
        return platMenuRepository.findById(id).get();
    }
}
