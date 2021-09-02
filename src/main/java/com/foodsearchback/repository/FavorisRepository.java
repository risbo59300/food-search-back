package com.foodsearchback.repository;

import com.foodsearchback.entities.FsFavoris;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorisRepository extends JpaRepository<FsFavoris, Long> {
}
