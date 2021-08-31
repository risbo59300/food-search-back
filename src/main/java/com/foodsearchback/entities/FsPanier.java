package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FS_Panier", schema = "public", catalog = "FoodSearch")
public class FsPanier {

    private int panId;
    private String panTitre;
    private int panPrix;
    private int panQuantite;
    private int panIdRestaurant;
    private int panIdUti;
    private FsUtilisateur fsUtilisateurByPanIdUti;

    @Id
    @Column(name = "Pan_id")
    public int getPanId() {
        return panId;
    }

    public void setPanId(int panId) {
        this.panId = panId;
    }

    @Basic
    @Column(name = "Pan_titre")
    public String getPanTitre() {
        return panTitre;
    }

    public void setPanTitre(String panTitre) {
        this.panTitre = panTitre;
    }

    @Basic
    @Column(name = "Pan_prix")
    public int getPanPrix() {
        return panPrix;
    }

    public void setPanPrix(int panPrix) {
        this.panPrix = panPrix;
    }

    @Basic
    @Column(name = "Pan_quantite")
    public int getPanQuantite() {
        return panQuantite;
    }

    public void setPanQuantite(int panQuantite) {
        this.panQuantite = panQuantite;
    }

    @Basic
    @Column(name = "Pan_idRestaurant")
    public int getPanIdRestaurant() {
        return panIdRestaurant;
    }

    public void setPanIdRestaurant(int panIdRestaurant) {
        this.panIdRestaurant = panIdRestaurant;
    }

    @Basic
    @Column(name = "Pan_idUti")
    public int getPanIdUti() {
        return panIdUti;
    }

    public void setPanIdUti(int panIdUti) {
        this.panIdUti = panIdUti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsPanier that = (FsPanier) o;
        return panId == that.panId && panPrix == that.panPrix && panQuantite == that.panQuantite && panIdRestaurant == that.panIdRestaurant && panIdUti == that.panIdUti && Objects.equals(panTitre, that.panTitre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(panId, panTitre, panPrix, panQuantite, panIdRestaurant, panIdUti);
    }

    @ManyToOne
    @JoinColumn(name = "Pan_idUti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByPanIdUti() {
        return fsUtilisateurByPanIdUti;
    }

    public void setFsUtilisateurByPanIdUti(FsUtilisateur fsUtilisateurByPanIdUti) {
        this.fsUtilisateurByPanIdUti = fsUtilisateurByPanIdUti;
    }
}
