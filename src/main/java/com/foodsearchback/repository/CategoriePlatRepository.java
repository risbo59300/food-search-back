package com.foodsearchback.repository;

import com.foodsearchback.entities.FsCategPlats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriePlatRepository extends JpaRepository<FsCategPlats, Long> {
}
