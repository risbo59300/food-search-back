package com.foodsearchback.entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity(name = "FS_Role")
public class FsRole {
    private int rolId;
    private String rolType;
    private Collection<FsUtilisateur> fsUtilisateursByRolId;

    @Id
    @Column(name = "Rol_id")
    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
    }

    @Basic
    @Column(name = "Rol_type")
    public String getRolType() {
        return rolType;
    }

    public void setRolType(String rolType) {
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

    @OneToMany(mappedBy = "fsRoleByUtiIdRol")
    public Collection<FsUtilisateur> getFsUtilisateursByRolId() {
        return fsUtilisateursByRolId;
    }

    public void setFsUtilisateursByRolId(Collection<FsUtilisateur> fsUtilisateursByRolId) {
        this.fsUtilisateursByRolId = fsUtilisateursByRolId;
    }
}
