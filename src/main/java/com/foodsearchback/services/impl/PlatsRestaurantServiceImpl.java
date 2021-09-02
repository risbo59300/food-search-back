package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsPlatsRestaurant;
import com.foodsearchback.repository.PlatRestaurantRepository;
import com.foodsearchback.services.PlatsRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PlatsRestaurantServiceImpl implements PlatsRestaurantService {

    @Autowired
    PlatRestaurantRepository platRestaurantRepository;

    @Override
    public void add(FsPlatsRestaurant type) {
        platRestaurantRepository.save(type);
    }

    @Override
    public void delete(FsPlatsRestaurant type) {
        platRestaurantRepository.delete(type);
    }

    @Override
    public void update(FsPlatsRestaurant type) {
        platRestaurantRepository.save(type);
    }

    @Override
    public List<FsPlatsRestaurant> findAll() {
        return platRestaurantRepository.findAll();
    }

    @Override
    public FsPlatsRestaurant findById(long id) {
        return platRestaurantRepository.findById(id).get();
    }
}
