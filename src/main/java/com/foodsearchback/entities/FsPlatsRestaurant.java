package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Plats_Restaurant", schema = "public", catalog = "FoodSearch")
public class FsPlatsRestaurant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PLATRESTO_SEQ")
    @SequenceGenerator(name = "PLATRESTO_SEQ", sequenceName = "PLATRESTO_SEQ", allocationSize = 1)
    @Column(name = "PR_id", unique = true, nullable = false)
    private Long prId;

    @Column(name = "PR_titre")
    private String prTitre;

    @Column(name = "PR_prix")
    private int prPrix;

    @Column(name = "PR_description")
    private String prDescription;

    @Column(name = "PR_photo")
    private String prPhoto;

    @OneToMany(mappedBy = "fsPlatsRestaurantByPhoIdPlatRes")
    private Collection<FsPhoto> fsPhotosByPrId;

    @OneToMany(mappedBy = "fsPlatsRestaurantByPmIdPlat")
    private Collection<FsPlatMenu> fsPlatMenusByPrId;

    @ManyToOne
    @JoinColumn(name = "pr_id_cat", referencedColumnName = "CP_id", nullable = false)
    private FsCategPlats fsCategPlatsByPrIdCat;

    @ManyToOne
    @JoinColumn(name = "pr_id_res", referencedColumnName = "Rest_id", nullable = false)
    private FsRestaurant fsRestaurantByPrIdRes;


    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public String getPrTitre() {
        return prTitre;
    }

    public void setPrTitre(String prTitre) {
        this.prTitre = prTitre;
    }

    public int getPrPrix() {
        return prPrix;
    }

    public void setPrPrix(int prPrix) {
        this.prPrix = prPrix;
    }

    public String getPrDescription() {
        return prDescription;
    }

    public void setPrDescription(String prDescription) {
        this.prDescription = prDescription;
    }

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

    public Collection<FsPhoto> getFsPhotosByPrId() {
        return fsPhotosByPrId;
    }

    public void setFsPhotosByPrId(Collection<FsPhoto> fsPhotosByPrId) {
        this.fsPhotosByPrId = fsPhotosByPrId;
    }

    public Collection<FsPlatMenu> getFsPlatMenusByPrId() {
        return fsPlatMenusByPrId;
    }

    public void setFsPlatMenusByPrId(Collection<FsPlatMenu> fsPlatMenusByPrId) {
        this.fsPlatMenusByPrId = fsPlatMenusByPrId;
    }


    public FsCategPlats getFsCategPlatsByPrIdCat() {
        return fsCategPlatsByPrIdCat;
    }

    public void setFsCategPlatsByPrIdCat(FsCategPlats fsCategPlatsByPrIdCat) {
        this.fsCategPlatsByPrIdCat = fsCategPlatsByPrIdCat;
    }


    public FsRestaurant getFsRestaurantByPrIdRes() {
        return fsRestaurantByPrIdRes;
    }

    public void setFsRestaurantByPrIdRes(FsRestaurant fsRestaurantByPrIdRes) {
        this.fsRestaurantByPrIdRes = fsRestaurantByPrIdRes;
    }
}
