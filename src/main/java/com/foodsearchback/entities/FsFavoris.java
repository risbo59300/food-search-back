package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FS_Favoris", schema = "public", catalog = "FoodSearch")
public class FsFavoris {
    private int favId;
    private int favIdRes;
    private FsUtilisateur fsUtilisateurByFavIdUtil;

    @Id
    @Column(name = "Fav_id")
    public int getFavId() {
        return favId;
    }

    public void setFavId(int favId) {
        this.favId = favId;
    }

    @Basic
    @Column(name = "Fav_idRes")
    public int getFavIdRes() {
        return favIdRes;
    }

    public void setFavIdRes(int favIdRes) {
        this.favIdRes = favIdRes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsFavoris that = (FsFavoris) o;
        return favId == that.favId && favIdRes == that.favIdRes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(favId, favIdRes);
    }

    @ManyToOne
    @JoinColumn(name = "Fav_idUti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByFavIdUtil() {
        return fsUtilisateurByFavIdUtil;
    }

    public void setFsUtilisateurByFavIdUtil(FsUtilisateur fsUtilisateurByFavIdUtil) {
        this.fsUtilisateurByFavIdUtil = fsUtilisateurByFavIdUtil;
    }
}
