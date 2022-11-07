package com.example.mygrocerystore.models;

public class UserModel {
    String name;
    String email_reg;
    String  password_reg;
    String profileImg;

    public UserModel() {
    }

    public UserModel(String name, String email_reg, String password_reg) {
        this.name = name;
        this.email_reg = email_reg;
        this.password_reg = password_reg;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_reg() {
        return email_reg;
    }

    public void setEmail_reg(String email_reg) {
        this.email_reg = email_reg;
    }

    public String getPassword_reg() {
        return password_reg;
    }

    public void setPassword_reg(String password_reg) {
        this.password_reg = password_reg;
    }

}
