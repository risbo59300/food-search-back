package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "FS_report")
public class FsReport {
    private int repId;
    private int repNombre;
    private int repIdUti;
    private FsUtilisateur fsUtilisateurByRepIdUti;

    @Id
    @Column(name = "Rep_id")
    public int getRepId() {
        return repId;
    }

    public void setRepId(int repId) {
        this.repId = repId;
    }

    @Basic
    @Column(name = "Rep_nombre")
    public int getRepNombre() {
        return repNombre;
    }

    public void setRepNombre(int repNombre) {
        this.repNombre = repNombre;
    }

    @Basic
    @Column(name = "Rep_idUti")
    public int getRepIdUti() {
        return repIdUti;
    }

    public void setRepIdUti(int repIdUti) {
        this.repIdUti = repIdUti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsReport that = (FsReport) o;
        return repId == that.repId && repNombre == that.repNombre && repIdUti == that.repIdUti;
    }

    @Override
    public int hashCode() {
        return Objects.hash(repId, repNombre, repIdUti);
    }

    @ManyToOne
    @JoinColumn(name = "Rep_idUti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByRepIdUti() {
        return fsUtilisateurByRepIdUti;
    }

    public void setFsUtilisateurByRepIdUti(FsUtilisateur fsUtilisateurByRepIdUti) {
        this.fsUtilisateurByRepIdUti = fsUtilisateurByRepIdUti;
    }
}
