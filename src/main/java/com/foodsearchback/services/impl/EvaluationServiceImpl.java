package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsEvaluation;
import com.foodsearchback.repository.EvaluationRepository;
import com.foodsearchback.services.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EvaluationServiceImpl implements EvaluationService {

    @Autowired
    EvaluationRepository evaluationRepository;

    @Override
    public void add(FsEvaluation type) {
        evaluationRepository.save(type);
    }

    @Override
    public void delete(FsEvaluation type) {
        evaluationRepository.delete(type);
    }

    @Override
    public void update(FsEvaluation type) {
        evaluationRepository.save(type);
    }

    @Override
    public List<FsEvaluation> findAll() {
        return evaluationRepository.findAll();
    }

    @Override
    public FsEvaluation findById(long id) {
        return evaluationRepository.findById(id).get();
    }
}
