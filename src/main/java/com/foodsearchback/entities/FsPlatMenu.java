package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "FS_PlatMenu")
public class FsPlatMenu {
    private int pmId;
    private int pmIdPlat;
    private int pmIdMenu;
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

    @Basic
    @Column(name = "PM_idPlat")
    public int getPmIdPlat() {
        return pmIdPlat;
    }

    public void setPmIdPlat(int pmIdPlat) {
        this.pmIdPlat = pmIdPlat;
    }

    @Basic
    @Column(name = "PM_idMenu")
    public int getPmIdMenu() {
        return pmIdMenu;
    }

    public void setPmIdMenu(int pmIdMenu) {
        this.pmIdMenu = pmIdMenu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsPlatMenu that = (FsPlatMenu) o;
        return pmId == that.pmId && pmIdPlat == that.pmIdPlat && pmIdMenu == that.pmIdMenu;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pmId, pmIdPlat, pmIdMenu);
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
