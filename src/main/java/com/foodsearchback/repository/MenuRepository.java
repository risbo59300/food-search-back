package com.foodsearchback.repository;

import com.foodsearchback.entities.FsMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<FsMenu, Long> {
}
