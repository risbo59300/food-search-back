package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "FS_Fidelite", schema = "public", catalog = "FoodSearch")
public class FsFidelite {
    private int fidId;
    private int fidPtsFid;
    private FsUtilisateur fsUtilisateurByFidIdUtil;

    @Id
    @Column(name = "Fid_id")
    public int getFidId() {
        return fidId;
    }

    public void setFidId(int fidId) {
        this.fidId = fidId;
    }

    @Basic
    @Column(name = "Fid_ptsFid")
    public int getFidPtsFid() {
        return fidPtsFid;
    }

    public void setFidPtsFid(int fidPtsFid) {
        this.fidPtsFid = fidPtsFid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsFidelite that = (FsFidelite) o;
        return fidId == that.fidId && fidPtsFid == that.fidPtsFid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fidId, fidPtsFid);
    }

    @ManyToOne
    @JoinColumn(name = "Fid_idUti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByFidIdUtil() {
        return fsUtilisateurByFidIdUtil;
    }

    public void setFsUtilisateurByFidIdUtil(FsUtilisateur fsUtilisateurByFidIdUtil) {
        this.fsUtilisateurByFidIdUtil = fsUtilisateurByFidIdUtil;
    }
}
