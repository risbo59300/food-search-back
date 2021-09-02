package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Menu", schema = "public", catalog = "FoodSearch")
public class FsMenu implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "MENU_SEQ")
    @SequenceGenerator(name = "MENU_SEQ", sequenceName = "MENU_SEQ", allocationSize = 1)
    @Column(name = "Men_id", unique = true, nullable = false)
    private Long menId;

    @Column(name = "Men_nom")
    private String menNom;

    @Column(name = "Men_type")
    private String menType;

    @Column(name = "Men_prix")
    private String menPrix;

    @OneToMany(mappedBy = "fsMenuByPmIdMenu")
    private Collection<FsPlatMenu> fsPlatMenusByMenId;


    public Long getMenId() {
        return menId;
    }

    public void setMenId(Long menId) {
        this.menId = menId;
    }

    public String getMenNom() {
        return menNom;
    }

    public void setMenNom(String menNom) {
        this.menNom = menNom;
    }

    public String getMenType() {
        return menType;
    }

    public void setMenType(String menType) {
        this.menType = menType;
    }

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

    public Collection<FsPlatMenu> getFsPlatMenusByMenId() {
        return fsPlatMenusByMenId;
    }

    public void setFsPlatMenusByMenId(Collection<FsPlatMenu> fsPlatMenusByMenId) {
        this.fsPlatMenusByMenId = fsPlatMenusByMenId;
    }
}
