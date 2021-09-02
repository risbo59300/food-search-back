package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_report", schema = "public", catalog = "FoodSearch")
public class FsReport implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "REPORT_SEQ")
    @SequenceGenerator(name = "REPORT_SEQ", sequenceName = "REPORT_SEQ", allocationSize = 1)
    @Column(name = "Rep_id", unique = true, nullable = false)
    private Long repId;

    @Column(name = "Rep_nombre")
    private int repNombre;

    @ManyToOne
    @JoinColumn(name = "Rep_id_Uti", referencedColumnName = "Uti_id", nullable = false)
    private FsUtilisateur fsUtilisateurByRepIdUti;


    public Long getRepId() {
        return repId;
    }

    public void setRepId(Long repId) {
        this.repId = repId;
    }

    public int getRepNombre() {
        return repNombre;
    }

    public void setRepNombre(int repNombre) {
        this.repNombre = repNombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsReport that = (FsReport) o;
        return repId == that.repId && repNombre == that.repNombre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(repId, repNombre);
    }


    public FsUtilisateur getFsUtilisateurByRepIdUti() {
        return fsUtilisateurByRepIdUti;
    }

    public void setFsUtilisateurByRepIdUti(FsUtilisateur fsUtilisateurByRepIdUti) {
        this.fsUtilisateurByRepIdUti = fsUtilisateurByRepIdUti;
    }
}
