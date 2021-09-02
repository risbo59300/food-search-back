package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Categ_Plats", schema = "public", catalog = "FoodSearch")
public class FsCategPlats implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "CP_SEQ")
    @SequenceGenerator(name = "CP_SEQ", sequenceName = "CP_SEQ", allocationSize = 1)
    @Column(name = "CP_id", unique = true, nullable = false)
    private Long cpId;

    @Column(name = "CP_type")
    private String cpType;

    @OneToMany(mappedBy = "fsCategPlatsByPrIdCat")
    private Collection<FsPlatsRestaurant> fsPlatsRestaurantsByCpId;


    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

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

    public Collection<FsPlatsRestaurant> getFsPlatsRestaurantsByCpId() {
        return fsPlatsRestaurantsByCpId;
    }

    public void setFsPlatsRestaurantsByCpId(Collection<FsPlatsRestaurant> fsPlatsRestaurantsByCpId) {
        this.fsPlatsRestaurantsByCpId = fsPlatsRestaurantsByCpId;
    }
}
