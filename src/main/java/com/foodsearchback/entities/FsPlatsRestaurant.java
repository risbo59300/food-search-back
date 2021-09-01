package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Plats_Restaurant", schema = "public", catalog = "FoodSearch")
public class FsPlatsRestaurant {
    private int prId;
    private String prTitre;
    private int prPrix;
    private String prDescription;
    private String prPhoto;
    private Collection<FsPhoto> fsPhotosByPrId;
    private Collection<FsPlatMenu> fsPlatMenusByPrId;
    private FsCategPlats fsCategPlatsByPrIdCat;
    private FsRestaurant fsRestaurantByPrIdRes;

    @Id
    @Column(name = "PR_id")
    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    @Basic
    @Column(name = "PR_titre")
    public String getPrTitre() {
        return prTitre;
    }

    public void setPrTitre(String prTitre) {
        this.prTitre = prTitre;
    }

    @Basic
    @Column(name = "PR_prix")
    public int getPrPrix() {
        return prPrix;
    }

    public void setPrPrix(int prPrix) {
        this.prPrix = prPrix;
    }

    @Basic
    @Column(name = "PR_description")
    public String getPrDescription() {
        return prDescription;
    }

    public void setPrDescription(String prDescription) {
        this.prDescription = prDescription;
    }

    @Basic
    @Column(name = "PR_photo")
    public String getPrPhoto() {
        return prPhoto;
    }

    public void setPrPhoto(String prPhoto) {
        this.prPhoto = prPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsPlatsRestaurant that = (FsPlatsRestaurant) o;
        return prId == that.prId && prPrix == that.prPrix && Objects.equals(prTitre, that.prTitre) && Objects.equals(prDescription, that.prDescription) && Objects.equals(prPhoto, that.prPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prId, prTitre, prPrix, prDescription, prPhoto);
    }

    @OneToMany(mappedBy = "fsPlatsRestaurantByPhoIdPlatRes")
    public Collection<FsPhoto> getFsPhotosByPrId() {
        return fsPhotosByPrId;
    }

    public void setFsPhotosByPrId(Collection<FsPhoto> fsPhotosByPrId) {
        this.fsPhotosByPrId = fsPhotosByPrId;
    }

    @OneToMany(mappedBy = "fsPlatsRestaurantByPmIdPlat")
    public Collection<FsPlatMenu> getFsPlatMenusByPrId() {
        return fsPlatMenusByPrId;
    }

    public void setFsPlatMenusByPrId(Collection<FsPlatMenu> fsPlatMenusByPrId) {
        this.fsPlatMenusByPrId = fsPlatMenusByPrId;
    }

    @ManyToOne
    @JoinColumn(name = "pr_id_cat", referencedColumnName = "CP_id", nullable = false)
    public FsCategPlats getFsCategPlatsByPrIdCat() {
        return fsCategPlatsByPrIdCat;
    }

    public void setFsCategPlatsByPrIdCat(FsCategPlats fsCategPlatsByPrIdCat) {
        this.fsCategPlatsByPrIdCat = fsCategPlatsByPrIdCat;
    }

    @ManyToOne
    @JoinColumn(name = "pr_id_res", referencedColumnName = "Rest_id", nullable = false)
    public FsRestaurant getFsRestaurantByPrIdRes() {
        return fsRestaurantByPrIdRes;
    }

    public void setFsRestaurantByPrIdRes(FsRestaurant fsRestaurantByPrIdRes) {
        this.fsRestaurantByPrIdRes = fsRestaurantByPrIdRes;
    }
}
