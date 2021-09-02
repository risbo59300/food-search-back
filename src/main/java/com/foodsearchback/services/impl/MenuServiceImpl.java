package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsMenu;
import com.foodsearchback.repository.MenuRepository;
import com.foodsearchback.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public void add(FsMenu type) {
        menuRepository.save(type);
    }

    @Override
    public void delete(FsMenu type) {
        menuRepository.delete(type);
    }

    @Override
    public void update(FsMenu type) {
        menuRepository.save(type);
    }

    @Override
    public List<FsMenu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public FsMenu findById(long id) {
        return menuRepository.findById(id).get();
    }
}
