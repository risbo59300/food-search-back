package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FS_Photo", schema = "public", catalog = "FoodSearch")
public class FsPhoto {
    private int phoId;
    private String phoChemin;
    private FsPlatsRestaurant fsPlatsRestaurantByPhoIdPlatRes;

    @Id
    @Column(name = "Pho_id")
    public int getPhoId() {
        return phoId;
    }

    public void setPhoId(int phoId) {
        this.phoId = phoId;
    }

    @Basic
    @Column(name = "Pho_chemin")
    public String getPhoChemin() {
        return phoChemin;
    }

    public void setPhoChemin(String phoChemin) {
        this.phoChemin = phoChemin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsPhoto that = (FsPhoto) o;
        return phoId == that.phoId && Objects.equals(phoChemin, that.phoChemin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoId, phoChemin);
    }

    @ManyToOne
    @JoinColumn(name = "Pho_idPlatRes", referencedColumnName = "Pr_id", nullable = false)
    public FsPlatsRestaurant getFsPlatsRestaurantByPhoIdPlatRes() {
        return fsPlatsRestaurantByPhoIdPlatRes;
    }

    public void setFsPlatsRestaurantByPhoIdPlatRes(FsPlatsRestaurant fsPlatsRestaurantByPhoIdPlatRes) {
        this.fsPlatsRestaurantByPhoIdPlatRes = fsPlatsRestaurantByPhoIdPlatRes;
    }
}
