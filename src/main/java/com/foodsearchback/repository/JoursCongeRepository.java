package com.foodsearchback.repository;

import com.foodsearchback.entities.FsJoursConges;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoursCongeRepository extends JpaRepository<FsJoursConges,Long> {
}
