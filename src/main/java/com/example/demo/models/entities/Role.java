package com.example.demo.models.entities;

import com.example.demo.models.enums.RoleName;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private RoleName role;

    public Role(RoleName role) {
        this.role = role;
    }

    public RoleName getRole() {
        return role;
    }

    public void setRole(RoleName role) {
        this.role = role;
    }
}
