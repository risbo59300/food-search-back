package com.foodsearchback.repository;

import com.foodsearchback.entities.FsCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<FsCommande, Long> {
}
