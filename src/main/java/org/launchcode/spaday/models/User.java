package org.launchcode.spaday.models;

import java.util.Date;

public class User {
    //username, email, password.
    private Integer id;
    private static Integer nextId = 1;
    private String username;
    private String email;
    private String password;
    private Date joinDate;

    public User(){
        id = nextId;
        nextId++;
        joinDate = new Date(System.currentTimeMillis());
    }

    public User(String username, String email, String password) {
        this();
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id.toString();
    }

    private void setId(Integer id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
