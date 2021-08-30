package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity(name = "FS_Restaurant")
public class FsRestaurant {
    private int restId;
    private String restNom;
    private String restTel;
    private int restIdUti;
    private int restIdSpe;
    private int restIdAdr;
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

    @Basic
    @Column(name = "Rest_idUti")
    public int getRestIdUti() {
        return restIdUti;
    }

    public void setRestIdUti(int restIdUti) {
        this.restIdUti = restIdUti;
    }

    @Basic
    @Column(name = "Rest_idSpe")
    public int getRestIdSpe() {
        return restIdSpe;
    }

    public void setRestIdSpe(int restIdSpe) {
        this.restIdSpe = restIdSpe;
    }

    @Basic
    @Column(name = "Rest_idAdr")
    public int getRestIdAdr() {
        return restIdAdr;
    }

    public void setRestIdAdr(int restIdAdr) {
        this.restIdAdr = restIdAdr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsRestaurant that = (FsRestaurant) o;
        return restId == that.restId && restIdUti == that.restIdUti && restIdSpe == that.restIdSpe && restIdAdr == that.restIdAdr && Objects.equals(restNom, that.restNom) && Objects.equals(restTel, that.restTel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restId, restNom, restTel, restIdUti, restIdSpe, restIdAdr);
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
    @JoinColumn(name = "Rest_idUti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByRestIdUti() {
        return fsUtilisateurByRestIdUti;
    }

    public void setFsUtilisateurByRestIdUti(FsUtilisateur fsUtilisateurByRestIdUti) {
        this.fsUtilisateurByRestIdUti = fsUtilisateurByRestIdUti;
    }

    @ManyToOne
    @JoinColumn(name = "Rest_idSpe", referencedColumnName = "Spe_id", nullable = false)
    public FsSpecialite getFsSpecialiteByRestIdSpe() {
        return fsSpecialiteByRestIdSpe;
    }

    public void setFsSpecialiteByRestIdSpe(FsSpecialite fsSpecialiteByRestIdSpe) {
        this.fsSpecialiteByRestIdSpe = fsSpecialiteByRestIdSpe;
    }
}
