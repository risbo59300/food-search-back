package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Adresse", schema = "public", catalog = "FoodSearch")
public class FsAdresse {
    private int adrId;
    private int adrNumero;
    private String adrRue;
    private String adrCplAdr;
    private int adrCp;
    private String adrVille;
    private String adrPays;
    //private FsUtilisateur fsUtilisateurByAdrId;
    private Collection<FsUtilisateur> fsUtilisateurByAdrId;
    private FsRestaurant fsRestaurantByAdrId;

    @Id
    @Column(name = "Adr_id")
    public int getAdrId() {
        return adrId;
    }

    public void setAdrId(int adrId) {
        this.adrId = adrId;
    }

    @Basic
    @Column(name = "Adr_numero")
    public int getAdrNumero() {
        return adrNumero;
    }

    public void setAdrNumero(int adrNumero) {
        this.adrNumero = adrNumero;
    }

    @Basic
    @Column(name = "Adr_rue")
    public String getAdrRue() {
        return adrRue;
    }

    public void setAdrRue(String adrRue) {
        this.adrRue = adrRue;
    }

    @Basic
    @Column(name = "Adr_cplAdr")
    public String getAdrCplAdr() {
        return adrCplAdr;
    }

    public void setAdrCplAdr(String adrCplAdr) {
        this.adrCplAdr = adrCplAdr;
    }

    @Basic
    @Column(name = "Adr_cp")
    public int getAdrCp() {
        return adrCp;
    }

    public void setAdrCp(int adrCp) {
        this.adrCp = adrCp;
    }

    @Basic
    @Column(name = "Adr_ville")
    public String getAdrVille() {
        return adrVille;
    }

    public void setAdrVille(String adrVille) {
        this.adrVille = adrVille;
    }

    @Basic
    @Column(name = "Adr_pays")
    public String getAdrPays() {
        return adrPays;
    }

    public void setAdrPays(String adrPays) {
        this.adrPays = adrPays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsAdresse that = (FsAdresse) o;
        return adrId == that.adrId && adrNumero == that.adrNumero && adrCp == that.adrCp && Objects.equals(adrRue, that.adrRue) && Objects.equals(adrCplAdr, that.adrCplAdr) && Objects.equals(adrVille, that.adrVille) && Objects.equals(adrPays, that.adrPays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adrId, adrNumero, adrRue, adrCplAdr, adrCp, adrVille, adrPays);
    }

    /*
    @ManyToOne
    @JoinColumn(name = "Adr_id_uti", referencedColumnName = "Uti_id")
    public FsUtilisateur getFsUtilisateurByAdrIdUti() {
        return fsUtilisateurByAdrIdUti;
    }

    public void setFsUtilisateurByAdrIdUti(FsUtilisateur fsUtilisateurByAdrIdUti) {
        this.fsUtilisateurByAdrIdUti = fsUtilisateurByAdrIdUti;
    }


     */
    @OneToMany(mappedBy = "fsAdresseByUtiIdAdr")
    public Collection<FsUtilisateur> getFsUtilisateurByAdrId() {
        return fsUtilisateurByAdrId;
    }

    public void setFsUtilisateurByAdrId(Collection<FsUtilisateur> fsUtilisateurByAdrId) {
        this.fsUtilisateurByAdrId = fsUtilisateurByAdrId;
    }

    @OneToOne(mappedBy = "fsAdresseByRestId")
    public FsRestaurant getFsRestaurantByAdrId() {
        return fsRestaurantByAdrId;
    }

    public void setFsRestaurantByAdrId(FsRestaurant fsRestaurantByAdrId) {
        this.fsRestaurantByAdrId = fsRestaurantByAdrId;
    }
}
