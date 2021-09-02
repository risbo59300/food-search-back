package com.foodsearchback.repository;

import com.foodsearchback.entities.FsPlatMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatMenuRepository extends JpaRepository<FsPlatMenu,Long> {
}
