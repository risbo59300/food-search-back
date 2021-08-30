package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "FS_Commande")
public class FsCommande {
    private int cmdId;
    private String cmdTitrePr;
    private int cmdPrixPr;
    private int cmdQuantitePr;
    private String cmdStatus;
    private int cmdIdUti;
    private int cmdIdRes;
    private int cmdIdEva;
    private FsRestaurant fsRestaurantByCmdIdRes;
    private FsEvaluation fsEvaluationByCmdIdEva;

    @Id
    @Column(name = "CMD_id")
    public int getCmdId() {
        return cmdId;
    }

    public void setCmdId(int cmdId) {
        this.cmdId = cmdId;
    }

    @Basic
    @Column(name = "CMD_titrePR")
    public String getCmdTitrePr() {
        return cmdTitrePr;
    }

    public void setCmdTitrePr(String cmdTitrePr) {
        this.cmdTitrePr = cmdTitrePr;
    }

    @Basic
    @Column(name = "CMD_prixPR")
    public int getCmdPrixPr() {
        return cmdPrixPr;
    }

    public void setCmdPrixPr(int cmdPrixPr) {
        this.cmdPrixPr = cmdPrixPr;
    }

    @Basic
    @Column(name = "CMD_quantitePR")
    public int getCmdQuantitePr() {
        return cmdQuantitePr;
    }

    public void setCmdQuantitePr(int cmdQuantitePr) {
        this.cmdQuantitePr = cmdQuantitePr;
    }

    @Basic
    @Column(name = "CMD_status")
    public String getCmdStatus() {
        return cmdStatus;
    }

    public void setCmdStatus(String cmdStatus) {
        this.cmdStatus = cmdStatus;
    }

    @Basic
    @Column(name = "CMD_idUti")
    public int getCmdIdUti() {
        return cmdIdUti;
    }

    public void setCmdIdUti(int cmdIdUti) {
        this.cmdIdUti = cmdIdUti;
    }

    @Basic
    @Column(name = "CMD_idRes")
    public int getCmdIdRes() {
        return cmdIdRes;
    }

    public void setCmdIdRes(int cmdIdRes) {
        this.cmdIdRes = cmdIdRes;
    }

    @Basic
    @Column(name = "CMD_idEva")
    public int getCmdIdEva() {
        return cmdIdEva;
    }

    public void setCmdIdEva(int cmdIdEva) {
        this.cmdIdEva = cmdIdEva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsCommande that = (FsCommande) o;
        return cmdId == that.cmdId && cmdPrixPr == that.cmdPrixPr && cmdQuantitePr == that.cmdQuantitePr && cmdIdUti == that.cmdIdUti && cmdIdRes == that.cmdIdRes && cmdIdEva == that.cmdIdEva && Objects.equals(cmdTitrePr, that.cmdTitrePr) && Objects.equals(cmdStatus, that.cmdStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmdId, cmdTitrePr, cmdPrixPr, cmdQuantitePr, cmdStatus, cmdIdUti, cmdIdRes, cmdIdEva);
    }

    @ManyToOne
    @JoinColumn(name = "CMD_idRes", referencedColumnName = "Rest_id", nullable = false)
    public FsRestaurant getFsRestaurantByCmdIdRes() {
        return fsRestaurantByCmdIdRes;
    }

    public void setFsRestaurantByCmdIdRes(FsRestaurant fsRestaurantByCmdIdRes) {
        this.fsRestaurantByCmdIdRes = fsRestaurantByCmdIdRes;
    }

    @ManyToOne
    @JoinColumn(name = "CMD_idEva", referencedColumnName = "Eva_id", nullable = false)
    public FsEvaluation getFsEvaluationByCmdIdEva() {
        return fsEvaluationByCmdIdEva;
    }

    public void setFsEvaluationByCmdIdEva(FsEvaluation fsEvaluationByCmdIdEva) {
        this.fsEvaluationByCmdIdEva = fsEvaluationByCmdIdEva;
    }
}
