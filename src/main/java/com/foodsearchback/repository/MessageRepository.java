package com.foodsearchback.repository;

import com.foodsearchback.entities.FsMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<FsMessage,Long> {
}
