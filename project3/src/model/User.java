package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private Long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Enterprise entiprise;
    private List<Transaction> transactions;
    private Date updatedAt;
    private Date createdAt;

    public User(Long id, String email, Profile profile, Enum_RoleName role, Enterprise entiprise, List<Transaction> transactions, Date updatedAt, Date createdAt) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.entiprise = entiprise;
        this.transactions = transactions;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public User(String email, Profile profile, Enum_RoleName role, Enterprise entiprise) {
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.entiprise = entiprise;

        transactions = new ArrayList<>();
        createdAt = new Date();
        updatedAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RoleName getRole() {
        return role;
    }

    public void setRole(Enum_RoleName role) {
        this.role = role;
    }

    public Enterprise getEntiprise() {
        return entiprise;
    }

    public void setEntiprise(Enterprise entiprise) {
        this.entiprise = entiprise;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
