package com.foodsearchback.repository;

import com.foodsearchback.entities.FsHoraires;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorairesRepository extends JpaRepository<FsHoraires, Long> {
}
