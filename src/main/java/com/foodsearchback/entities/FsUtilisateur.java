package com.foodsearchback.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Utilisateur", schema = "public", catalog = "FoodSearch")
public class FsUtilisateur {
    private int utiId;
    private String utiNom;
    private String utiPrenom;
    private String utiTel;
    private String utiPseudo;
    private String utiMail;
    private String utiMdp;
    private Date utiDdn;
    private String utiPhoto;
    private FsAdresse fsAdresseByUtiId;
    //private Collection<FsAdresse> fsAdressesByUtiId;
    private Collection<FsFavoris> fsFavorisesByUtiId;
    private Collection<FsFidelite> fsFidelitesByUtiId;
    private Collection<FsMessage> fsMessagesByUtiId;
    private Collection<FsPanier> fsPaniersByUtiId;
    private Collection<FsRestaurant> fsRestaurantsByUtiId;
    private FsRole fsRoleByUtiIdRol;
    private Collection<FsReport> fsReportsByUtiId;

    @Id
    @Column(name = "Uti_id")
    public int getUtiId() {
        return utiId;
    }

    public void setUtiId(int utiId) {
        this.utiId = utiId;
    }

    @Basic
    @Column(name = "Uti_nom")
    public String getUtiNom() {
        return utiNom;
    }

    public void setUtiNom(String utiNom) {
        this.utiNom = utiNom;
    }

    @Basic
    @Column(name = "Uti_prenom")
    public String getUtiPrenom() {
        return utiPrenom;
    }

    public void setUtiPrenom(String utiPrenom) {
        this.utiPrenom = utiPrenom;
    }

    @Basic
    @Column(name = "Uti_Tel")
    public String getUtiTel() {
        return utiTel;
    }

    public void setUtiTel(String utiTel) {
        this.utiTel = utiTel;
    }

    @Basic
    @Column(name = "Uti_pseudo")
    public String getUtiPseudo() {
        return utiPseudo;
    }

    public void setUtiPseudo(String utiPseudo) {
        this.utiPseudo = utiPseudo;
    }

    @Basic
    @Column(name = "Uti_mail")
    public String getUtiMail() {
        return utiMail;
    }

    public void setUtiMail(String utiMail) {
        this.utiMail = utiMail;
    }

    @Basic
    @Column(name = "Uti_mdp")
    public String getUtiMdp() {
        return utiMdp;
    }

    public void setUtiMdp(String utiMdp) {
        this.utiMdp = utiMdp;
    }

    @Basic
    @Column(name = "Uti_DDN")
    public Date getUtiDdn() {
        return utiDdn;
    }

    public void setUtiDdn(Date utiDdn) {
        this.utiDdn = utiDdn;
    }

    @Basic
    @Column(name = "Uti_photo")
    public String getUtiPhoto() {
        return utiPhoto;
    }

    public void setUtiPhoto(String utiPhoto) {
        this.utiPhoto = utiPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsUtilisateur that = (FsUtilisateur) o;
        return utiId == that.utiId && Objects.equals(utiNom, that.utiNom) && Objects.equals(utiPrenom, that.utiPrenom) && Objects.equals(utiTel, that.utiTel) && Objects.equals(utiPseudo, that.utiPseudo) && Objects.equals(utiMail, that.utiMail) && Objects.equals(utiMdp, that.utiMdp) && Objects.equals(utiDdn, that.utiDdn) && Objects.equals(utiPhoto, that.utiPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utiId, utiNom, utiPrenom, utiTel, utiPseudo, utiMail, utiMdp, utiDdn, utiPhoto);
    }

    /*
    @OneToMany(mappedBy = "fsUtilisateurByAdrIdUti")
    public Collection<FsAdresse> getFsAdressesByUtiId() {
        return fsAdressesByUtiId;
    }

    public void setFsAdressesByUtiId(Collection<FsAdresse> fsAdressesByUtiId) {
        this.fsAdressesByUtiId = fsAdressesByUtiId;
    }
*/

    @ManyToOne
    @JoinColumn(name = "Uti_id_adr", referencedColumnName = "Adr_id")
    public FsAdresse getFsAdresseByUtiIdAdr() {
        return fsAdresseByUtiId;
    }

    public void setFsAdresseByUtiIdAdr(FsAdresse fsAdresseByUtiId) {
        this.fsAdresseByUtiId = fsAdresseByUtiId;
    }

    @OneToMany(mappedBy = "fsUtilisateurByFavIdUtil")
    public Collection<FsFavoris> getFsFavorisesByUtiId() {
        return fsFavorisesByUtiId;
    }

    public void setFsFavorisesByUtiId(Collection<FsFavoris> fsFavorisesByUtiId) {
        this.fsFavorisesByUtiId = fsFavorisesByUtiId;
    }

    @OneToMany(mappedBy = "fsUtilisateurByFidIdUtil")
    public Collection<FsFidelite> getFsFidelitesByUtiId() {
        return fsFidelitesByUtiId;
    }

    public void setFsFidelitesByUtiId(Collection<FsFidelite> fsFidelitesByUtiId) {
        this.fsFidelitesByUtiId = fsFidelitesByUtiId;
    }

    @OneToMany(mappedBy = "fsUtilisateurByMsgIdUti")
    public Collection<FsMessage> getFsMessagesByUtiId() {
        return fsMessagesByUtiId;
    }

    public void setFsMessagesByUtiId(Collection<FsMessage> fsMessagesByUtiId) {
        this.fsMessagesByUtiId = fsMessagesByUtiId;
    }

    @OneToMany(mappedBy = "fsUtilisateurByPanIdUti")
    public Collection<FsPanier> getFsPaniersByUtiId() {
        return fsPaniersByUtiId;
    }

    public void setFsPaniersByUtiId(Collection<FsPanier> fsPaniersByUtiId) {
        this.fsPaniersByUtiId = fsPaniersByUtiId;
    }

    @OneToMany(mappedBy = "fsUtilisateurByRestIdUti")
    public Collection<FsRestaurant> getFsRestaurantsByUtiId() {
        return fsRestaurantsByUtiId;
    }

    public void setFsRestaurantsByUtiId(Collection<FsRestaurant> fsRestaurantsByUtiId) {
        this.fsRestaurantsByUtiId = fsRestaurantsByUtiId;
    }

    @ManyToOne
    @JoinColumn(name = "Uti_idRole", referencedColumnName = "Rol_id", nullable = false)
    public FsRole getFsRoleByUtiIdRol() {
        return fsRoleByUtiIdRol;
    }

    public void setFsRoleByUtiIdRol(FsRole fsRoleByUtiIdRol) {
        this.fsRoleByUtiIdRol = fsRoleByUtiIdRol;
    }

    @OneToMany(mappedBy = "fsUtilisateurByRepIdUti")
    public Collection<FsReport> getFsReportsByUtiId() {
        return fsReportsByUtiId;
    }

    public void setFsReportsByUtiId(Collection<FsReport> fsReportsByUtiId) {
        this.fsReportsByUtiId = fsReportsByUtiId;
    }
}
