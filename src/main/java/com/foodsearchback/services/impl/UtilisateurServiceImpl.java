package com.foodsearchback.services.impl;

import com.foodsearchback.entities.FsUtilisateur;
import com.foodsearchback.repository.UtilisateurRepository;
import com.foodsearchback.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @Override
    public void add(FsUtilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public void delete(FsUtilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);
    }

    @Override
    public void update(FsUtilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<FsUtilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    @Override
    public FsUtilisateur findById(long id) {
        return utilisateurRepository.findById(id).get();
    }
}
