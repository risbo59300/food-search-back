package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Restaurant", schema = "public", catalog = "FoodSearch")
public class FsRestaurant implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "RESTO_SEQ")
    @SequenceGenerator(name = "RESTO_SEQ", sequenceName = "RESTO_SEQ", allocationSize = 1)
    @Column(name = "Rest_id", unique = true, nullable = false)
    private Long restId;

    @Column(name = "Rest_nom")
    private String restNom;

    @Column(name = "Rest_tel")
    private String restTel;

    @OneToMany(mappedBy = "fsRestaurantByCmdIdRes")
    private Collection<FsCommande> fsCommandesByRestId;

    @OneToMany(mappedBy = "fsRestaurantByPrIdRes")
    private Collection<FsPlatsRestaurant> fsPlatsRestaurantsByRestId;

    @OneToOne
    @JoinColumn(name = "Rest_id", referencedColumnName = "Adr_id", nullable = false)
    private FsAdresse fsAdresseByRestId;

    @ManyToOne
    @JoinColumn(name = "Rest_id_Uti", referencedColumnName = "Uti_id", nullable = false)
    private FsUtilisateur fsUtilisateurByRestIdUti;

    @ManyToOne
    @JoinColumn(name = "Rest_id_Spe", referencedColumnName = "Spe_id", nullable = false)
    private FsSpecialite fsSpecialiteByRestIdSpe;


    public Long getRestId() {
        return restId;
    }

    public void setRestId(Long restId) {
        this.restId = restId;
    }

    public String getRestNom() {
        return restNom;
    }

    public void setRestNom(String restNom) {
        this.restNom = restNom;
    }

    public String getRestTel() {
        return restTel;
    }

    public void setRestTel(String restTel) {
        this.restTel = restTel;
    }



    public Collection<FsCommande> getFsCommandesByRestId() {
        return fsCommandesByRestId;
    }

    public void setFsCommandesByRestId(Collection<FsCommande> fsCommandesByRestId) {
        this.fsCommandesByRestId = fsCommandesByRestId;
    }

    public Collection<FsPlatsRestaurant> getFsPlatsRestaurantsByRestId() {
        return fsPlatsRestaurantsByRestId;
    }

    public void setFsPlatsRestaurantsByRestId(Collection<FsPlatsRestaurant> fsPlatsRestaurantsByRestId) {
        this.fsPlatsRestaurantsByRestId = fsPlatsRestaurantsByRestId;
    }


    public FsAdresse getFsAdresseByRestId() {
        return fsAdresseByRestId;
    }

    public void setFsAdresseByRestId(FsAdresse fsAdresseByRestId) {
        this.fsAdresseByRestId = fsAdresseByRestId;
    }


    public FsUtilisateur getFsUtilisateurByRestIdUti() {
        return fsUtilisateurByRestIdUti;
    }

    public void setFsUtilisateurByRestIdUti(FsUtilisateur fsUtilisateurByRestIdUti) {
        this.fsUtilisateurByRestIdUti = fsUtilisateurByRestIdUti;
    }


    public FsSpecialite getFsSpecialiteByRestIdSpe() {
        return fsSpecialiteByRestIdSpe;
    }

    public void setFsSpecialiteByRestIdSpe(FsSpecialite fsSpecialiteByRestIdSpe) {
        this.fsSpecialiteByRestIdSpe = fsSpecialiteByRestIdSpe;
    }
}
