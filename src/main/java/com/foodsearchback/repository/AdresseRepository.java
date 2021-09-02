package com.foodsearchback.repository;

import com.foodsearchback.entities.FsAdresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresseRepository extends JpaRepository<FsAdresse, Long> {
}
