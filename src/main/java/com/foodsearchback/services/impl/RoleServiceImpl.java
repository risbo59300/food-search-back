package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsRole;
import com.foodsearchback.repository.RoleRepository;
import com.foodsearchback.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void add(FsRole type) {
        roleRepository.save(type);
    }

    @Override
    public void delete(FsRole type) {
        roleRepository.delete(type);
    }

    @Override
    public void update(FsRole type) {
        roleRepository.save(type);
    }

    @Override
    public List<FsRole> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public FsRole findById(long id) {
        return roleRepository.findById(id).get();
    }
}
