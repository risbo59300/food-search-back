package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_Panier", schema = "public", catalog = "FoodSearch")
public class FsPanier implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PANIER_SEQ")
    @SequenceGenerator(name = "PANIER_SEQ", sequenceName = "PANIER_SEQ", allocationSize = 1)
    @Column(name = "Pan_id", unique = true, nullable = false)
    private Long panId;

    @Column(name = "Pan_titre")
    private String panTitre;

    @Column(name = "Pan_prix")
    private int panPrix;

    @Column(name = "Pan_quantite")
    private int panQuantite;

    @Column(name = "Pan_idRestaurant")
    private int panIdRestaurant;

    @ManyToOne
    @JoinColumn(name = "pan_id_uti", referencedColumnName = "Uti_id", nullable = false)
    private FsUtilisateur fsUtilisateurByPanIdUti;


    public Long getPanId() {
        return panId;
    }

    public void setPanId(Long panId) {
        this.panId = panId;
    }

    public String getPanTitre() {
        return panTitre;
    }

    public void setPanTitre(String panTitre) {
        this.panTitre = panTitre;
    }

    public int getPanPrix() {
        return panPrix;
    }

    public void setPanPrix(int panPrix) {
        this.panPrix = panPrix;
    }

    public int getPanQuantite() {
        return panQuantite;
    }

    public void setPanQuantite(int panQuantite) {
        this.panQuantite = panQuantite;
    }

    public int getPanIdRestaurant() {
        return panIdRestaurant;
    }

    public void setPanIdRestaurant(int panIdRestaurant) {
        this.panIdRestaurant = panIdRestaurant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsPanier that = (FsPanier) o;
        return panId == that.panId && panPrix == that.panPrix && panQuantite == that.panQuantite && panIdRestaurant == that.panIdRestaurant && Objects.equals(panTitre, that.panTitre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(panId, panTitre, panPrix, panQuantite, panIdRestaurant);
    }


    public FsUtilisateur getFsUtilisateurByPanIdUti() {
        return fsUtilisateurByPanIdUti;
    }

    public void setFsUtilisateurByPanIdUti(FsUtilisateur fsUtilisateurByPanIdUti) {
        this.fsUtilisateurByPanIdUti = fsUtilisateurByPanIdUti;
    }
}
