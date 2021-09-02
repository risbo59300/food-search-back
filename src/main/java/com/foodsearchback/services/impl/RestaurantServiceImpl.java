package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsRestaurant;
import com.foodsearchback.repository.RestaurantRepository;
import com.foodsearchback.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;

    @Override
    public void add(FsRestaurant type) {
        restaurantRepository.save(type);
    }

    @Override
    public void delete(FsRestaurant type) {
        restaurantRepository.delete(type);
    }

    @Override
    public void update(FsRestaurant type) {
        restaurantRepository.save(type);
    }

    @Override
    public List<FsRestaurant> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public FsRestaurant findById(long id) {
        return restaurantRepository.findById(id).get();
    }
}
