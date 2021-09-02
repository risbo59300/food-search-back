package com.foodsearchback.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * A FSJoursConges.
 */
@Entity
@Table(name = "fs_jours_conges")
public class FsJoursConges implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "JOURCONGE_SEQ")
    @SequenceGenerator(name = "JOURCONGE_SEQ", sequenceName = "JOURCONGE_SEQ", allocationSize = 1)
    @Column(name = "jourconge_id", unique = true, nullable = false)
    private Long id;

    @Column(name = "jour_conge")
    private LocalDate jourConge;

    @ManyToOne
    @JsonIgnoreProperties(value = "congesRests", allowSetters = true)
    private FsRestaurant fSRestaurant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getJourConge() {
        return jourConge;
    }

    public FsJoursConges jourConge(LocalDate jourConge) {
        this.jourConge = jourConge;
        return this;
    }

    public void setJourConge(LocalDate jourConge) {
        this.jourConge = jourConge;
    }

    public FsRestaurant getFSRestaurant() {
        return fSRestaurant;
    }

    public FsJoursConges fSRestaurant(FsRestaurant fSRestaurant) {
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
        if (!(o instanceof FsJoursConges)) {
            return false;
        }
        return id != null && id.equals(((FsJoursConges) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FSJoursConges{" +
            "id=" + getId() +
            ", jourConge='" + getJourConge() + "'" +
            "}";
    }
}
