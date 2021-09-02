package com.foodsearchback.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.foodsearchback.entities.enumeration.FsSemaine;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A FSHoraires.
 */
@Entity
@Table(name = "fs_horaires")
public class FsHoraires implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "HORAIRES_SEQ")
    @SequenceGenerator(name = "HORAIRES_SEQ", sequenceName = "HORAIRES_SEQ", allocationSize = 1)
    @Column(name = "horaire_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "ouverture_matin")
    private int ouvertureMatin;

    @Column(name = "fermeture_matin")
    private int fermetureMatin;

    @Column(name = "ouverture_apres_midi")
    private int ouvertureApresMidi;

    @Column(name = "fermeture_apres_midi")
    private int fermetureApresMidi;

    @Column(name = "date_jour")
    private LocalDate dateJour;

    @Column(name = "ouvert")
    private Boolean ouvert;

    @Enumerated(EnumType.STRING)
    @Column(name = "fermeture_hebdomadaire")
    private FsSemaine fermetureHebdomadaire;

    @ManyToOne
    @JsonIgnoreProperties(value = "restHors", allowSetters = true)
    private FsRestaurant fSRestaurant;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOuvertureMatin() {
        return ouvertureMatin;
    }

    public FsHoraires ouvertureMatin(int ouvertureMatin) {
        this.ouvertureMatin = ouvertureMatin;
        return this;
    }

    public void setOuvertureMatin(int ouvertureMatin) {
        this.ouvertureMatin = ouvertureMatin;
    }

    public int getFermetureMatin() {
        return fermetureMatin;
    }

    public FsHoraires fermetureMatin(int fermetureMatin) {
        this.fermetureMatin = fermetureMatin;
        return this;
    }

    public void setFermetureMatin(int fermetureMatin) {
        this.fermetureMatin = fermetureMatin;
    }

    public int getOuvertureApresMidi() {
        return ouvertureApresMidi;
    }

    public FsHoraires ouvertureApresMidi(int ouvertureApresMidi) {
        this.ouvertureApresMidi = ouvertureApresMidi;
        return this;
    }

    public void setOuvertureApresMidi(int ouvertureApresMidi) {
        this.ouvertureApresMidi = ouvertureApresMidi;
    }

    public int getFermetureApresMidi() {
        return fermetureApresMidi;
    }

    public FsHoraires fermetureApresMidi(int fermetureApresMidi) {
        this.fermetureApresMidi = fermetureApresMidi;
        return this;
    }

    public void setFermetureApresMidi(int fermetureApresMidi) {
        this.fermetureApresMidi = fermetureApresMidi;
    }

    public LocalDate getDateJour() {
        return dateJour;
    }

    public FsHoraires dateJour(LocalDate dateJour) {
        this.dateJour = dateJour;
        return this;
    }

    public void setDateJour(LocalDate dateJour) {
        this.dateJour = dateJour;
    }

    public Boolean isOuvert() {
        return ouvert;
    }

    public FsHoraires ouvert(Boolean ouvert) {
        this.ouvert = ouvert;
        return this;
    }

    public void setOuvert(Boolean ouvert) {
        this.ouvert = ouvert;
    }

    public FsSemaine getFermetureHebdomadaire() {
        return fermetureHebdomadaire;
    }

    public FsHoraires fermetureHebdomadaire(FsSemaine fermetureHebdomadaire) {
        this.fermetureHebdomadaire = fermetureHebdomadaire;
        return this;
    }

    public void setFermetureHebdomadaire(FsSemaine fermetureHebdomadaire) {
        this.fermetureHebdomadaire = fermetureHebdomadaire;
    }

    public FsRestaurant getFSRestaurant() {
        return fSRestaurant;
    }

    public FsHoraires fSRestaurant(FsRestaurant fSRestaurant) {
        this.fSRestaurant = fSRestaurant;
        return this;
    }

    public void setFSRestaurant(FsRestaurant fSRestaurant) {
        this.fSRestaurant = fSRestaurant;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FsHoraires)) {
            return false;
        }
        return id != null && id.equals(((FsHoraires) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FSHoraires{" +
            "id=" + getId() +
            ", ouvertureMatin=" + getOuvertureMatin() +
            ", fermetureMatin=" + getFermetureMatin() +
            ", ouvertureApresMidi=" + getOuvertureApresMidi() +
            ", fermetureApresMidi=" + getFermetureApresMidi() +
            ", dateJour='" + getDateJour() + "'" +
            ", ouvert='" + isOuvert() + "'" +
            ", fermetureHebdomadaire='" + getFermetureHebdomadaire() + "'" +
            "}";
    }
}
