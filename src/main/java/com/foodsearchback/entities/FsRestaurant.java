package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Restaurant", schema = "public", catalog = "FoodSearch")
public class FsRestaurant {
    private int restId;
    private String restNom;
    private String restTel;
    private Collection<FsCommande> fsCommandesByRestId;
    private Collection<FsPlatsRestaurant> fsPlatsRestaurantsByRestId;
    private FsAdresse fsAdresseByRestId;
    private FsUtilisateur fsUtilisateurByRestIdUti;
    private FsSpecialite fsSpecialiteByRestIdSpe;

    @Id
    @Column(name = "Rest_id")
    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    @Basic
    @Column(name = "Rest_nom")
    public String getRestNom() {
        return restNom;
    }

    public void setRestNom(String restNom) {
        this.restNom = restNom;
    }

    @Basic
    @Column(name = "Rest_tel")
    public String getRestTel() {
        return restTel;
    }

    public void setRestTel(String restTel) {
        this.restTel = restTel;
    }



    @OneToMany(mappedBy = "fsRestaurantByCmdIdRes")
    public Collection<FsCommande> getFsCommandesByRestId() {
        return fsCommandesByRestId;
    }

    public void setFsCommandesByRestId(Collection<FsCommande> fsCommandesByRestId) {
        this.fsCommandesByRestId = fsCommandesByRestId;
    }

    @OneToMany(mappedBy = "fsRestaurantByPrIdRes")
    public Collection<FsPlatsRestaurant> getFsPlatsRestaurantsByRestId() {
        return fsPlatsRestaurantsByRestId;
    }

    public void setFsPlatsRestaurantsByRestId(Collection<FsPlatsRestaurant> fsPlatsRestaurantsByRestId) {
        this.fsPlatsRestaurantsByRestId = fsPlatsRestaurantsByRestId;
    }

    @OneToOne
    @JoinColumn(name = "Rest_id", referencedColumnName = "Adr_id", nullable = false)
    public FsAdresse getFsAdresseByRestId() {
        return fsAdresseByRestId;
    }

    public void setFsAdresseByRestId(FsAdresse fsAdresseByRestId) {
        this.fsAdresseByRestId = fsAdresseByRestId;
    }

    @ManyToOne
    @JoinColumn(name = "Rest_id_Uti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByRestIdUti() {
        return fsUtilisateurByRestIdUti;
    }

    public void setFsUtilisateurByRestIdUti(FsUtilisateur fsUtilisateurByRestIdUti) {
        this.fsUtilisateurByRestIdUti = fsUtilisateurByRestIdUti;
    }

    @ManyToOne
    @JoinColumn(name = "Rest_id_Spe", referencedColumnName = "Spe_id", nullable = false)
    public FsSpecialite getFsSpecialiteByRestIdSpe() {
        return fsSpecialiteByRestIdSpe;
    }

    public void setFsSpecialiteByRestIdSpe(FsSpecialite fsSpecialiteByRestIdSpe) {
        this.fsSpecialiteByRestIdSpe = fsSpecialiteByRestIdSpe;
    }
}
