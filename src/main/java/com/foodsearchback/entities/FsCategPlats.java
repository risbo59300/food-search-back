package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Categ_Plats", schema = "public", catalog = "FoodSearch")
public class FsCategPlats {
    private int cpId;
    private String cpType;
    private Collection<FsPlatsRestaurant> fsPlatsRestaurantsByCpId;

    @Id
    @Column(name = "CP_id")
    public int getCpId() {
        return cpId;
    }

    public void setCpId(int cpId) {
        this.cpId = cpId;
    }

    @Basic
    @Column(name = "CP_type")
    public String getCpType() {
        return cpType;
    }

    public void setCpType(String cpType) {
        this.cpType = cpType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsCategPlats that = (FsCategPlats) o;
        return cpId == that.cpId && Objects.equals(cpType, that.cpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpId, cpType);
    }

    @OneToMany(mappedBy = "fsCategPlatsByPrIdCat")
    public Collection<FsPlatsRestaurant> getFsPlatsRestaurantsByCpId() {
        return fsPlatsRestaurantsByCpId;
    }

    public void setFsPlatsRestaurantsByCpId(Collection<FsPlatsRestaurant> fsPlatsRestaurantsByCpId) {
        this.fsPlatsRestaurantsByCpId = fsPlatsRestaurantsByCpId;
    }
}
