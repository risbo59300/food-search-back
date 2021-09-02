package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "FS_Message", schema = "public", catalog = "FoodSearch")
public class FsMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "MESSAGE_SEQ")
    @SequenceGenerator(name = "MESSAGE_SEQ", sequenceName = "MESSAGE_SEQ", allocationSize = 1)
    @Column(name = "Msg_id", unique = true, nullable = false)
    private Long msgId;

    @Column(name = "Msg_message")
    private String msgMessage;

    @Column(name = "Msg_date")
    private Date msgDate;

    @ManyToOne
    @JoinColumn(name = "msg_id_uti", referencedColumnName = "Uti_id", nullable = false)
    private FsUtilisateur fsUtilisateurByMsgIdUti;


    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getMsgMessage() {
        return msgMessage;
    }

    public void setMsgMessage(String msgMessage) {
        this.msgMessage = msgMessage;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsMessage that = (FsMessage) o;
        return msgId == that.msgId && Objects.equals(msgMessage, that.msgMessage) && Objects.equals(msgDate, that.msgDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msgId, msgMessage, msgDate);
    }


    public FsUtilisateur getFsUtilisateurByMsgIdUti() {
        return fsUtilisateurByMsgIdUti;
    }

    public void setFsUtilisateurByMsgIdUti(FsUtilisateur fsUtilisateurByMsgIdUti) {
        this.fsUtilisateurByMsgIdUti = fsUtilisateurByMsgIdUti;
    }
}
