package com.example.demo.models.entities;

import com.example.demo.models.entities.Role;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone", length = 11)
    private String phone;

    @Column(name = "wallet", precision = 11, scale = 2)
    private BigDecimal wallet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    protected User() {}

    public User(String username, String email, String phone, BigDecimal wallet, Role role) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.wallet = wallet;
        this.role = role;
    }

    public User(String username, String email, String phone, Role role) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.wallet = wallet;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
