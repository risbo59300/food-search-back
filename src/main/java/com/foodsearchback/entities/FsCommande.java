package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "FS_Commande", schema = "public", catalog = "FoodSearch")
public class FsCommande implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "COMMANDE_SEQ")
    @SequenceGenerator(name = "COMMANDE_SEQ", sequenceName = "COMMANDE_SEQ", allocationSize = 1)
    @Column(name = "CMD_id", unique = true, nullable = false)
    private Long cmdId;

    @Column(name = "CMD_titrePR")
    private String cmdTitrePr;

    @Column(name = "CMD_prixPR")
    private int cmdPrixPr;

    @Column(name = "CMD_quantitePR")
    private int cmdQuantitePr;

    @Column(name = "CMD_status")
    private String cmdStatus;

    @Column(name = "cmd_id_uti")
    private int cmdIdUti;

    @ManyToOne
    @JoinColumn(name = "cmd_id_res", referencedColumnName = "Rest_id", nullable = false)
    private FsRestaurant fsRestaurantByCmdIdRes;

    @ManyToOne
    @JoinColumn(name = "cmd_id_eva", referencedColumnName = "Eva_id", nullable = false)
    private FsEvaluation fsEvaluationByCmdIdEva;


    public Long getCmdId() {
        return cmdId;
    }

    public void setCmdId(Long cmdId) {
        this.cmdId = cmdId;
    }

    public String getCmdTitrePr() {
        return cmdTitrePr;
    }

    public void setCmdTitrePr(String cmdTitrePr) {
        this.cmdTitrePr = cmdTitrePr;
    }

    public int getCmdPrixPr() {
        return cmdPrixPr;
    }

    public void setCmdPrixPr(int cmdPrixPr) {
        this.cmdPrixPr = cmdPrixPr;
    }

    public int getCmdQuantitePr() {
        return cmdQuantitePr;
    }

    public void setCmdQuantitePr(int cmdQuantitePr) {
        this.cmdQuantitePr = cmdQuantitePr;
    }

    public String getCmdStatus() {
        return cmdStatus;
    }

    public void setCmdStatus(String cmdStatus) {
        this.cmdStatus = cmdStatus;
    }

    public int getCmdIdUti() {
        return cmdIdUti;
    }

    public void setCmdIdUti(int cmdIdUti) {
        this.cmdIdUti = cmdIdUti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsCommande that = (FsCommande) o;
        return cmdId == that.cmdId && cmdPrixPr == that.cmdPrixPr && cmdQuantitePr == that.cmdQuantitePr && cmdIdUti == that.cmdIdUti && Objects.equals(cmdTitrePr, that.cmdTitrePr) && Objects.equals(cmdStatus, that.cmdStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmdId, cmdTitrePr, cmdPrixPr, cmdQuantitePr, cmdStatus, cmdIdUti);
    }


    public FsRestaurant getFsRestaurantByCmdIdRes() {
        return fsRestaurantByCmdIdRes;
    }

    public void setFsRestaurantByCmdIdRes(FsRestaurant fsRestaurantByCmdIdRes) {
        this.fsRestaurantByCmdIdRes = fsRestaurantByCmdIdRes;
    }


    public FsEvaluation getFsEvaluationByCmdIdEva() {
        return fsEvaluationByCmdIdEva;
    }

    public void setFsEvaluationByCmdIdEva(FsEvaluation fsEvaluationByCmdIdEva) {
        this.fsEvaluationByCmdIdEva = fsEvaluationByCmdIdEva;
    }
}
