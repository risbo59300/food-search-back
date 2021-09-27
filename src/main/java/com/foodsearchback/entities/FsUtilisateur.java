package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Utilisateur", schema = "public", catalog = "FoodSearch")
public class FsUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "UTILISATEUR_SEQ")
    @SequenceGenerator(name = "UTILISATEUR_SEQ", sequenceName = "UTILISATEUR_SEQ", allocationSize = 1)
    @Column(name = "Uti_id", unique = true, nullable = false)
    private Long utiId;

    @Column(name = "Uti_nom")
    private String utiNom;

    @Column(name = "Uti_prenom")
    private String utiPrenom;

    @Column(name = "Uti_Tel")
    private String utiTel;

    @Column(name = "Uti_pseudo")
    private String utiPseudo;

    @Column(name = "Uti_mail")
    private String utiMail;

    @Column(name = "Uti_mdp")
    private String utiMdp;

    @Column(name = "Uti_DDN")
    private Date utiDdn;

    @Column(name = "uti_photo")
    private String utiPhoto;

    @ManyToOne
    @JoinColumn(name = "Uti_id_adr", referencedColumnName = "Adr_id", nullable = false)
    private FsAdresse fsAdresseByUtiId;

    @OneToMany(mappedBy = "fsUtilisateurByFavIdUtil",fetch = FetchType.LAZY)
    private Collection<FsFavoris> fsFavorisesByUtiId;

    @OneToMany(mappedBy = "fsUtilisateurByFidIdUtil",fetch = FetchType.LAZY)
    private Collection<FsFidelite> fsFidelitesByUtiId;

    @OneToMany(mappedBy = "fsUtilisateurByMsgIdUti",fetch = FetchType.LAZY)
    private Collection<FsMessage> fsMessagesByUtiId;

    @OneToMany(mappedBy = "fsUtilisateurByPanIdUti",fetch = FetchType.LAZY)
    private Collection<FsPanier> fsPanierByUtiId;

    //@OneToOne
    //@JoinColumn(name = "Uti_id", referencedColumnName = "Pan_id", nullable = false)
    //private FsPanier fsPanierByUtiId;

    @OneToMany(mappedBy = "fsUtilisateurByRestIdUti",fetch = FetchType.LAZY)
    private Collection<FsRestaurant> fsRestaurantsByUtiId;

    @ManyToOne
    @JoinColumn(name = "Uti_idRole", referencedColumnName = "Rol_id", nullable = false)
    private FsRole fsRoleByUtiIdRol;

    @OneToMany(mappedBy = "fsUtilisateurByRepIdUti",fetch = FetchType.LAZY)
    private Collection<FsReport> fsReportsByUtiId;


    public Long getUtiId() {
        return utiId;
    }

    public void setUtiId(Long utiId) {
        this.utiId = utiId;
    }

    public String getUtiNom() {
        return utiNom;
    }

    public void setUtiNom(String utiNom) {
        this.utiNom = utiNom;
    }

    public String getUtiPrenom() {
        return utiPrenom;
    }

    public void setUtiPrenom(String utiPrenom) {
        this.utiPrenom = utiPrenom;
    }

    public String getUtiTel() {
        return utiTel;
    }

    public void setUtiTel(String utiTel) {
        this.utiTel = utiTel;
    }

    public String getUtiPseudo() {
        return utiPseudo;
    }

    public void setUtiPseudo(String utiPseudo) {
        this.utiPseudo = utiPseudo;
    }

    public String getUtiMail() {
        return utiMail;
    }

    public void setUtiMail(String utiMail) {
        this.utiMail = utiMail;
    }

    public String getUtiMdp() {
        return utiMdp;
    }

    public void setUtiMdp(String utiMdp) {
        this.utiMdp = utiMdp;
    }

    public Date getUtiDdn() {
        return utiDdn;
    }

    public void setUtiDdn(Date utiDdn) {
        this.utiDdn = utiDdn;
    }

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
        return utiId.equals(that.utiId) && Objects.equals(utiNom, that.utiNom) && Objects.equals(utiPrenom, that.utiPrenom) && Objects.equals(utiTel, that.utiTel) && Objects.equals(utiPseudo, that.utiPseudo) && Objects.equals(utiMail, that.utiMail) && Objects.equals(utiMdp, that.utiMdp) && Objects.equals(utiDdn, that.utiDdn) && Objects.equals(utiPhoto, that.utiPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utiId, utiNom, utiPrenom, utiTel, utiPseudo, utiMail, utiMdp, utiDdn, utiPhoto);
    }


    public FsAdresse getFsAdresseByUtiIdAdr() {
        return fsAdresseByUtiId;
    }

    public void setFsAdresseByUtiIdAdr(FsAdresse fsAdresseByUtiId) {
        this.fsAdresseByUtiId = fsAdresseByUtiId;
    }

    public Collection<FsFavoris> getFsFavorisesByUtiId() {
        return fsFavorisesByUtiId;
    }

    public void setFsFavorisesByUtiId(Collection<FsFavoris> fsFavorisesByUtiId) {
        this.fsFavorisesByUtiId = fsFavorisesByUtiId;
    }

    public Collection<FsFidelite> getFsFidelitesByUtiId() {
        return fsFidelitesByUtiId;
    }

    public void setFsFidelitesByUtiId(Collection<FsFidelite> fsFidelitesByUtiId) {
        this.fsFidelitesByUtiId = fsFidelitesByUtiId;
    }

    public Collection<FsMessage> getFsMessagesByUtiId() {
        return fsMessagesByUtiId;
    }

    public void setFsMessagesByUtiId(Collection<FsMessage> fsMessagesByUtiId) {
        this.fsMessagesByUtiId = fsMessagesByUtiId;
    }

    public FsPanier getFsPaniersByUtiId() {
        return (FsPanier) fsPanierByUtiId;
    }

    public void setFsPaniersByUtiId(FsPanier fsPaniersByUtiId) {
        this.fsPanierByUtiId = (Collection<FsPanier>) fsPaniersByUtiId;
    }

    public Collection<FsRestaurant> getFsRestaurantsByUtiId() {
        return fsRestaurantsByUtiId;
    }

    public void setFsRestaurantsByUtiId(Collection<FsRestaurant> fsRestaurantsByUtiId) {
        this.fsRestaurantsByUtiId = fsRestaurantsByUtiId;
    }


    public FsRole getFsRoleByUtiIdRol() {
        return fsRoleByUtiIdRol;
    }

    public void setFsRoleByUtiIdRol(FsRole fsRoleByUtiIdRol) {
        this.fsRoleByUtiIdRol = fsRoleByUtiIdRol;
    }

    public Collection<FsReport> getFsReportsByUtiId() {
        return fsReportsByUtiId;
    }

    public void setFsReportsByUtiId(Collection<FsReport> fsReportsByUtiId) {
        this.fsReportsByUtiId = fsReportsByUtiId;
    }
}
