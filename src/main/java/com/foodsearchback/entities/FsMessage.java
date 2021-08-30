package com.foodsearchback.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity(name = "FS_Message")
public class FsMessage {
    private int msgId;
    private String msgMessage;
    private Date msgDate;
    private int msgIdUti;
    private FsUtilisateur fsUtilisateurByMsgIdUti;

    @Id
    @Column(name = "Msg_id")
    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    @Basic
    @Column(name = "Msg_message")
    public String getMsgMessage() {
        return msgMessage;
    }

    public void setMsgMessage(String msgMessage) {
        this.msgMessage = msgMessage;
    }

    @Basic
    @Column(name = "Msg_date")
    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    @Basic
    @Column(name = "Msg_idUti")
    public int getMsgIdUti() {
        return msgIdUti;
    }

    public void setMsgIdUti(int msgIdUti) {
        this.msgIdUti = msgIdUti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsMessage that = (FsMessage) o;
        return msgId == that.msgId && msgIdUti == that.msgIdUti && Objects.equals(msgMessage, that.msgMessage) && Objects.equals(msgDate, that.msgDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId, msgMessage, msgDate, msgIdUti);
    }

    @ManyToOne
    @JoinColumn(name = "Msg_idUti", referencedColumnName = "Uti_id", nullable = false)
    public FsUtilisateur getFsUtilisateurByMsgIdUti() {
        return fsUtilisateurByMsgIdUti;
    }

    public void setFsUtilisateurByMsgIdUti(FsUtilisateur fsUtilisateurByMsgIdUti) {
        this.fsUtilisateurByMsgIdUti = fsUtilisateurByMsgIdUti;
    }
}
