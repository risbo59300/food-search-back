package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_Plat_Menu", schema = "public", catalog = "FoodSearch")
public class FsPlatMenu implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PLATMENU_SEQ")
    @SequenceGenerator(name = "PLATMENU_SEQ", sequenceName = "PLATMENU_SEQ", allocationSize = 1)
    @Column(name = "PM_id", unique = true, nullable = false)
    private Long pmId;

    @ManyToOne
    @JoinColumn(name = "pm_id_plat", referencedColumnName = "PR_id", nullable = false)
    private FsPlatsRestaurant fsPlatsRestaurantByPmIdPlat;

    @ManyToOne
    @JoinColumn(name = "pm_id_menu", referencedColumnName = "Men_id", nullable = false)
    private FsMenu fsMenuByPmIdMenu;


    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
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


    public FsPlatsRestaurant getFsPlatsRestaurantByPmIdPlat() {
        return fsPlatsRestaurantByPmIdPlat;
    }

    public void setFsPlatsRestaurantByPmIdPlat(FsPlatsRestaurant fsPlatsRestaurantByPmIdPlat) {
        this.fsPlatsRestaurantByPmIdPlat = fsPlatsRestaurantByPmIdPlat;
    }


    public FsMenu getFsMenuByPmIdMenu() {
        return fsMenuByPmIdMenu;
    }

    public void setFsMenuByPmIdMenu(FsMenu fsMenuByPmIdMenu) {
        this.fsMenuByPmIdMenu = fsMenuByPmIdMenu;
    }
}
