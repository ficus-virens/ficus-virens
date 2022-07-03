package dev.daqiang.ficusvirens.root.domain.entity;

import dev.daqiang.ficusvirens.root.domain.enums.RoleEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2019/12/19
 * Package dev.daqiang.ficusvirens.root.domain.entity in ficus-virens
 */
@Data
public class Role extends BaseEntity implements Serializable {

    private Long id;


    private RoleEnum roleName;

    //private List<Permission> permissions;

    public Role(RoleEnum roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return id.equals(role.id) &&
                roleName.equals(role.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleName);
    }
}
