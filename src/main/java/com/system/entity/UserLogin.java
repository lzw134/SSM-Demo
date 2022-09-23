package com.system.entity;

public class UserLogin {
    private int u_id;
    private String username;
    private String password;

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "u_id=" + u_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}