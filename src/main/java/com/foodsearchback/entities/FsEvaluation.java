package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Evaluation", schema = "public", catalog = "FoodSearch")
public class FsEvaluation {
    private int evaId;
    private Integer evaNote;
    private String evaCommentaire;
    private Collection<FsCommande> fsCommandesByEvaId;

    @Id
    @Column(name = "Eva_id")
    public int getEvaId() {
        return evaId;
    }

    public void setEvaId(int evaId) {
        this.evaId = evaId;
    }

    @Basic
    @Column(name = "Eva_note")
    public Integer getEvaNote() {
        return evaNote;
    }

    public void setEvaNote(Integer evaNote) {
        this.evaNote = evaNote;
    }

    @Basic
    @Column(name = "Eva_commentaire")
    public String getEvaCommentaire() {
        return evaCommentaire;
    }

    public void setEvaCommentaire(String evaCommentaire) {
        this.evaCommentaire = evaCommentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsEvaluation that = (FsEvaluation) o;
        return evaId == that.evaId && Objects.equals(evaNote, that.evaNote) && Objects.equals(evaCommentaire, that.evaCommentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaId, evaNote, evaCommentaire);
    }

    @OneToMany(mappedBy = "fsEvaluationByCmdIdEva")
    public Collection<FsCommande> getFsCommandesByEvaId() {
        return fsCommandesByEvaId;
    }

    public void setFsCommandesByEvaId(Collection<FsCommande> fsCommandesByEvaId) {
        this.fsCommandesByEvaId = fsCommandesByEvaId;
    }
}
