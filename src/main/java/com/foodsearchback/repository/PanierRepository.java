package com.foodsearchback.repository;

import com.foodsearchback.entities.FsPanier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierRepository extends JpaRepository<FsPanier,Long> {
}
