package com.foodsearchback.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Specialite", schema = "public", catalog = "FoodSearch")
public class FsSpecialite implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SPECIALITE_SEQ")
    @SequenceGenerator(name = "SPECIALITE_SEQ", sequenceName = "SPECIALITE_SEQ", allocationSize = 1)
    @Column(name = "Spe_id", unique = true, nullable = false)
    private Long speId;

    @Column(name = "Spe_type")
    private String speType;

    @OneToMany(mappedBy = "fsSpecialiteByRestIdSpe")
    private Collection<FsRestaurant> fsRestaurantsBySpeId;


    public Long getSpeId() {
        return speId;
    }

    public void setSpeId(Long speId) {
        this.speId = speId;
    }

    public String getSpeType() {
        return speType;
    }

    public void setSpeType(String speType) {
        this.speType = speType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsSpecialite that = (FsSpecialite) o;
        return speId == that.speId && Objects.equals(speType, that.speType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speId, speType);
    }

    public Collection<FsRestaurant> getFsRestaurantsBySpeId() {
        return fsRestaurantsBySpeId;
    }

    public void setFsRestaurantsBySpeId(Collection<FsRestaurant> fsRestaurantsBySpeId) {
        this.fsRestaurantsBySpeId = fsRestaurantsBySpeId;
    }
}
