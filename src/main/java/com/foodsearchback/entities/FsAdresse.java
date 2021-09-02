package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Adresse", schema = "public", catalog = "FoodSearch")
public class FsAdresse implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ADRESSE_SEQ")
    @SequenceGenerator(name = "ADRESSE_SEQ", sequenceName = "ADRESSE_SEQ", allocationSize = 1)
    @Column(name = "Adr_id", unique = true, nullable = false)
    private Long adrId;

    @Column(name = "Adr_numero")
    private int adrNumero;

    @Column(name = "Adr_rue")
    private String adrRue;

    @Column(name = "Adr_cplAdr")
    private String adrCplAdr;

    @Column(name = "Adr_cp")
    private int adrCp;

    @Column(name = "Adr_ville")
    private String adrVille;

    @Column(name = "Adr_pays")
    private String adrPays;

    @OneToMany(mappedBy = "fsAdresseByUtiId", fetch=FetchType.LAZY)
    private Collection<FsUtilisateur> fsUtilisateurByAdrId;

    @OneToOne(mappedBy = "fsAdresseByRestId")
    private FsRestaurant fsRestaurantByAdrId;


    public Long getAdrId() {
        return adrId;
    }

    public void setAdrId(Long adrId) {
        this.adrId = adrId;
    }

    public int getAdrNumero() {
        return adrNumero;
    }

    public void setAdrNumero(int adrNumero) {
        this.adrNumero = adrNumero;
    }

    public String getAdrRue() {
        return adrRue;
    }

    public void setAdrRue(String adrRue) {
        this.adrRue = adrRue;
    }

    public String getAdrCplAdr() {
        return adrCplAdr;
    }

    public void setAdrCplAdr(String adrCplAdr) {
        this.adrCplAdr = adrCplAdr;
    }

    public int getAdrCp() {
        return adrCp;
    }

    public void setAdrCp(int adrCp) {
        this.adrCp = adrCp;
    }

    public String getAdrVille() {
        return adrVille;
    }

    public void setAdrVille(String adrVille) {
        this.adrVille = adrVille;
    }

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


    public Collection<FsUtilisateur> getFsUtilisateurByAdrId() {
        return fsUtilisateurByAdrId;
    }

    public void setFsUtilisateurByAdrId(Collection<FsUtilisateur> fsUtilisateurByAdrId) {
        this.fsUtilisateurByAdrId = fsUtilisateurByAdrId;
    }

    public FsRestaurant getFsRestaurantByAdrId() {
        return fsRestaurantByAdrId;
    }

    public void setFsRestaurantByAdrId(FsRestaurant fsRestaurantByAdrId) {
        this.fsRestaurantByAdrId = fsRestaurantByAdrId;
    }
}
