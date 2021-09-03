package com.foodsearchback.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.foodsearchback.entities.enumeration.ERole;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "FS_Role", schema = "public", catalog = "FoodSearch")
public class FsRole implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "ROLE_SEQ")
    @SequenceGenerator(name = "ROLE_SEQ", sequenceName = "ROLE_SEQ", allocationSize = 1)
    @Column(name = "Rol_id", unique = true, nullable = false)
    private Long rolId;

    @Enumerated(EnumType.STRING)
    @Column(name = "Rol_type", nullable=false)
    private ERole rolType;

    @OneToMany(mappedBy = "fsRoleByUtiIdRol", fetch=FetchType.LAZY)
    private Collection<FsUtilisateur> fsUtilisateursByRolId;


    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }


    public ERole getRolType() {
        return rolType;
    }

    public void setRolType(ERole rolType) {
        this.rolType = rolType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FsRole that = (FsRole) o;
        return rolId == that.rolId && Objects.equals(rolType, that.rolType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolId, rolType);
    }


    public Collection<FsUtilisateur> getFsUtilisateursByRolId() {
        return fsUtilisateursByRolId;
    }

    public void setFsUtilisateursByRolId(Collection<FsUtilisateur> fsUtilisateursByRolId) {
        this.fsUtilisateursByRolId = fsUtilisateursByRolId;
    }
}
