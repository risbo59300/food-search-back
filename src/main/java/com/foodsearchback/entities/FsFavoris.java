package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_Favoris", schema = "public", catalog = "FoodSearch")
public class FsFavoris implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FAVORIS_SEQ")
    @SequenceGenerator(name = "FAVORIS_SEQ", sequenceName = "FAVORIS_SEQ", allocationSize = 1)
    @Column(name = "Fav_id", unique = true, nullable = false)
    private Long favId;

    @Column(name = "Fav_id_res")
    private Long favIdRes;

    @ManyToOne
    @JoinColumn(name = "fav_id_uti", referencedColumnName = "Uti_id", nullable = false)
    private FsUtilisateur fsUtilisateurByFavIdUtil;


    public Long getFavId() {
        return favId;
    }

    public void setFavId(Long favId) {
        this.favId = favId;
    }

    public Long getFavIdRes() {
        return favIdRes;
    }

    public void setFavIdRes(Long favIdRes) {
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


    public FsUtilisateur getFsUtilisateurByFavIdUtil() {
        return fsUtilisateurByFavIdUtil;
    }

    public void setFsUtilisateurByFavIdUtil(FsUtilisateur fsUtilisateurByFavIdUtil) {
        this.fsUtilisateurByFavIdUtil = fsUtilisateurByFavIdUtil;
    }
}
