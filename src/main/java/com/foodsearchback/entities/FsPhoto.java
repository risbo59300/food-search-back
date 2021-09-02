package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_Photo", schema = "public", catalog = "FoodSearch")
public class FsPhoto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PHOTO_SEQ")
    @SequenceGenerator(name = "PHOTO_SEQ", sequenceName = "PHOTO_SEQ", allocationSize = 1)
    @Column(name = "Pho_id", unique = true, nullable = false)
    private Long phoId;

    @Column(name = "Pho_chemin")
    private String phoChemin;

    @ManyToOne
    @JoinColumn(name = "pho_id_plat_res", referencedColumnName = "Pr_id", nullable = false)
    private FsPlatsRestaurant fsPlatsRestaurantByPhoIdPlatRes;


    public Long getPhoId() {
        return phoId;
    }

    public void setPhoId(Long phoId) {
        this.phoId = phoId;
    }

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


    public FsPlatsRestaurant getFsPlatsRestaurantByPhoIdPlatRes() {
        return fsPlatsRestaurantByPhoIdPlatRes;
    }

    public void setFsPlatsRestaurantByPhoIdPlatRes(FsPlatsRestaurant fsPlatsRestaurantByPhoIdPlatRes) {
        this.fsPlatsRestaurantByPhoIdPlatRes = fsPlatsRestaurantByPhoIdPlatRes;
    }
}
