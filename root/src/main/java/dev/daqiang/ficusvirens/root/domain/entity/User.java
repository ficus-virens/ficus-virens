package dev.daqiang.ficusvirens.root.domain.entity;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.*;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2021-11-09
 * Package dev.daqiang.ficusvirens.root.domain.entity in ficus-virens
 */
@Data
public class User extends BaseEntity implements UserDetails, Serializable {

    private Long id;

    private String username;

    private String nickname;

    private String email;

    private String avatar;

    private String description;

    private Date expireTime;

    private boolean isLocked;

    private boolean isEnabled;

    private String password;

    private List<Role> roles;

    // private UserInfo userInfo;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createBy=" + createBy +
                ", createTime=" + createTime +
                ", lastUpdateBy=" + lastUpdateBy +
                ", lastUpdateTime=" + lastUpdateTime +
                ", objectVersionNumber=" + objectVersionNumber +
                '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        if (this.roles == null) {
            System.out.println("role is null");
            return null;
        }
        for (Role role : this.roles) {
            System.out.println("ydq log role name" + role.getRoleName());
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
