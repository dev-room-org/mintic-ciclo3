package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Enterprise {
    private Long id;
    private String name;
    private String document;
    private String phone;
    private String address;
    private List<User> users;
    private List<Transaction> transactions;
    private Date createdAt;
    private Date updatedAt;


    public Enterprise(Long id, String name, String document, String phone, String address, List<User> users, List<Transaction> transactions, Date createdAt, Date updatedAt) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.address = address;
        this.users = users;
        this.transactions = transactions;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public void addTransaction (String concept, Float amount, User user){
        if (transactions != null){
            Transaction t = new Transaction(0L, concept, amount, user, this, new Date(), new Date());
            transactions.add(t);
        }
    }

    public void addUser (String email, Profile profile, Enum_RoleName role){
        if (users == null) {
            users = new ArrayList<>();
        }
        User u = new User(email, profile, role, this);
        users.add(u);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
