package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Menu", schema = "public", catalog = "FoodSearch")
public class FsMenu {
    private int menId;
    private String menNom;
    private String menType;
    private String menPrix;
    private Collection<FsPlatMenu> fsPlatMenusByMenId;

    @Id
    @Column(name = "Men_id")
    public int getMenId() {
        return menId;
    }

    public void setMenId(int menId) {
        this.menId = menId;
    }

    @Basic
    @Column(name = "Men_nom")
    public String getMenNom() {
        return menNom;
    }

    public void setMenNom(String menNom) {
        this.menNom = menNom;
    }

    @Basic
    @Column(name = "Men_type")
    public String getMenType() {
        return menType;
    }

    public void setMenType(String menType) {
        this.menType = menType;
    }

    @Basic
    @Column(name = "Men_prix")
    public String getMenPrix() {
        return menPrix;
    }

    public void setMenPrix(String menPrix) {
        this.menPrix = menPrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsMenu that = (FsMenu) o;
        return menId == that.menId && Objects.equals(menNom, that.menNom) && Objects.equals(menType, that.menType) && Objects.equals(menPrix, that.menPrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menId, menNom, menType, menPrix);
    }

    @OneToMany(mappedBy = "fsMenuByPmIdMenu")
    public Collection<FsPlatMenu> getFsPlatMenusByMenId() {
        return fsPlatMenusByMenId;
    }

    public void setFsPlatMenusByMenId(Collection<FsPlatMenu> fsPlatMenusByMenId) {
        this.fsPlatMenusByMenId = fsPlatMenusByMenId;
    }
}
