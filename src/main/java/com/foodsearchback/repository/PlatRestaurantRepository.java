package com.foodsearchback.repository;

import com.foodsearchback.entities.FsPlatsRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatRestaurantRepository extends JpaRepository<FsPlatsRestaurant,Long> {
}
