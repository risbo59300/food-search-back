package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity(name = "FS_Specialite")
public class FsSpecialite {
    private int speId;
    private String speType;
    private Collection<FsRestaurant> fsRestaurantsBySpeId;

    @Id
    @Column(name = "Spe_id")
    public int getSpeId() {
        return speId;
    }

    public void setSpeId(int speId) {
        this.speId = speId;
    }

    @Basic
    @Column(name = "Spe_type")
    public String getSpeType() {
        return speType;
    }

    public void setSpeType(String speType) {
        this.speType = speType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsSpecialite that = (FsSpecialite) o;
        return speId == that.speId && Objects.equals(speType, that.speType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speId, speType);
    }

    @OneToMany(mappedBy = "fsSpecialiteByRestIdSpe")
    public Collection<FsRestaurant> getFsRestaurantsBySpeId() {
        return fsRestaurantsBySpeId;
    }

    public void setFsRestaurantsBySpeId(Collection<FsRestaurant> fsRestaurantsBySpeId) {
        this.fsRestaurantsBySpeId = fsRestaurantsBySpeId;
    }
}
