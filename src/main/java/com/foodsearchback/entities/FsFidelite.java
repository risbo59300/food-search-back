package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_Fidelite", schema = "public", catalog = "FoodSearch")
public class FsFidelite implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "FIDELITE_SEQ")
    @SequenceGenerator(name = "FIDELITE_SEQ", sequenceName = "FIDELITE_SEQ", allocationSize = 1)
    @Column(name = "Fid_id", unique = true, nullable = false)
    private Long fidId;

    @Column(name = "Fid_pts_fid")
    private Long fidPtsFid;

    @ManyToOne
    @JoinColumn(name = "fid_id_uti", referencedColumnName = "Uti_id", nullable = false)
    private FsUtilisateur fsUtilisateurByFidIdUtil;


    public Long getFidId() {
        return fidId;
    }

    public void setFidId(Long fidId) {
        this.fidId = fidId;
    }

    public Long getFidPtsFid() {
        return fidPtsFid;
    }

    public void setFidPtsFid(Long fidPtsFid) {
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


    public FsUtilisateur getFsUtilisateurByFidIdUtil() {
        return fsUtilisateurByFidIdUtil;
    }

    public void setFsUtilisateurByFidIdUtil(FsUtilisateur fsUtilisateurByFidIdUtil) {
        this.fsUtilisateurByFidIdUtil = fsUtilisateurByFidIdUtil;
    }
}
