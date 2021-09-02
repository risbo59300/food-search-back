package com.foodsearchback.repository;

import com.foodsearchback.entities.FsPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<FsPhoto,Long> {
}
