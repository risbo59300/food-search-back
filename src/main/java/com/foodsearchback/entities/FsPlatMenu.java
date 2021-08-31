package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FS_Plat_Menu", schema = "public", catalog = "FoodSearch")
public class FsPlatMenu {
    private int pmId;
    private FsPlatsRestaurant fsPlatsRestaurantByPmIdPlat;
    private FsMenu fsMenuByPmIdMenu;

    @Id
    @Column(name = "PM_id")
    public int getPmId() {
        return pmId;
    }

    public void setPmId(int pmId) {
        this.pmId = pmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsPlatMenu that = (FsPlatMenu) o;
        return pmId == that.pmId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pmId);
    }

    @ManyToOne
    @JoinColumn(name = "PM_idPlat", referencedColumnName = "PR_id", nullable = false)
    public FsPlatsRestaurant getFsPlatsRestaurantByPmIdPlat() {
        return fsPlatsRestaurantByPmIdPlat;
    }

    public void setFsPlatsRestaurantByPmIdPlat(FsPlatsRestaurant fsPlatsRestaurantByPmIdPlat) {
        this.fsPlatsRestaurantByPmIdPlat = fsPlatsRestaurantByPmIdPlat;
    }

    @ManyToOne
    @JoinColumn(name = "PM_idMenu", referencedColumnName = "Men_id", nullable = false)
    public FsMenu getFsMenuByPmIdMenu() {
        return fsMenuByPmIdMenu;
    }

    public void setFsMenuByPmIdMenu(FsMenu fsMenuByPmIdMenu) {
        this.fsMenuByPmIdMenu = fsMenuByPmIdMenu;
    }
}
