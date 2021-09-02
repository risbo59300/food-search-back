package com.foodsearchback.repository;

import com.foodsearchback.entities.FsRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<FsRestaurant,Long> {
}
