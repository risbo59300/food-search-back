package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsPhoto;
import com.foodsearchback.repository.PhotoRepository;
import com.foodsearchback.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class photoServiceImpl implements PhotoService {

    @Autowired
    PhotoRepository photoRepository;

    @Override
    public void add(FsPhoto type) {
        photoRepository.save(type);
    }

    @Override
    public void delete(FsPhoto type) {
        photoRepository.delete(type);
    }

    @Override
    public void update(FsPhoto type) {
        photoRepository.save(type);
    }

    @Override
    public List<FsPhoto> findAll() {
        return photoRepository.findAll();
    }

    @Override
    public FsPhoto findById(long id) {
        return photoRepository.findById(id).get();
    }
}
