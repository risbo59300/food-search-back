package com.foodsearchback.repository;

import com.foodsearchback.entities.FsUtilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<FsUtilisateur,Long> {

}
