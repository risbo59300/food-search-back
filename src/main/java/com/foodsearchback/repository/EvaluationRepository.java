package com.foodsearchback.repository;

import com.foodsearchback.entities.FsEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<FsEvaluation, Long> {
}
