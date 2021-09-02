package com.foodsearchback.repository;

import com.foodsearchback.entities.FsSpecialite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialiteRepository extends JpaRepository<FsSpecialite,Long> {
}
