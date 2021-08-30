package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "FS_Fidelite")
public class FsFidelite {
    private int fidId;
    private int fidPtsFid;
    private int fidIdUtil;
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

    @Basic
    @Column(name = "Fid_idUtil")
    public int getFidIdUtil() {
        return fidIdUtil;
    }

    public void setFidIdUtil(int fidIdUtil) {
        this.fidIdUtil = fidIdUtil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsFidelite that = (FsFidelite) o;
        return fidId == that.fidId && fidPtsFid == that.fidPtsFid && fidIdUtil == that.fidIdUtil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fidId, fidPtsFid, fidIdUtil);
    }

    @ManyToOne
    @JoinColumn(name = "Fid_idUtil", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByFidIdUtil() {
        return fsUtilisateurByFidIdUtil;
    }

    public void setFsUtilisateurByFidIdUtil(FsUtilisateur fsUtilisateurByFidIdUtil) {
        this.fsUtilisateurByFidIdUtil = fsUtilisateurByFidIdUtil;
    }
}
