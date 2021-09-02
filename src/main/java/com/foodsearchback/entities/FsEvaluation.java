package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Evaluation", schema = "public", catalog = "FoodSearch")
public class FsEvaluation implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "EVALUATION_SEQ")
    @SequenceGenerator(name = "EVALUATION_SEQ", sequenceName = "EVALUATION_SEQ", allocationSize = 1)
    @Column(name = "Eva_id", unique = true, nullable = false)
    private Long evaId;

    @Column(name = "Eva_note", nullable=false)
    private int evaNote;

    @Column(name = "Eva_commentaire")
    private String evaCommentaire;

    @OneToMany(mappedBy = "fsEvaluationByCmdIdEva")
    private Collection<FsCommande> fsCommandesByEvaId;


    public Long getEvaId() {
        return evaId;
    }

    public void setEvaId(Long evaId) {
        this.evaId = evaId;
    }

    public int getEvaNote() {
        return evaNote;
    }

    public void setEvaNote(int evaNote) {
        this.evaNote = evaNote;
    }

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

    public Collection<FsCommande> getFsCommandesByEvaId() {
        return fsCommandesByEvaId;
    }

    public void setFsCommandesByEvaId(Collection<FsCommande> fsCommandesByEvaId) {
        this.fsCommandesByEvaId = fsCommandesByEvaId;
    }
}
