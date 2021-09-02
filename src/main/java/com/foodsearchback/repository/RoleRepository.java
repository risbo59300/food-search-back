package com.foodsearchback.repository;

import com.foodsearchback.entities.FsRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<FsRole,Long> {
}
