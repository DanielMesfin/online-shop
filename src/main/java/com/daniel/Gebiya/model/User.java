package com.daniel.Gebiya.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false,nullable = false)
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userProfile;
    private String userPhoneNumber;
    private String userBios;
    @Column(nullable = false,updatable = false)
    private String userCode;
    private Long userCustomer;

    public User(Long userId, String userName, String userEmail, String userPassword, String userProfile, String userPhoneNumber, String userBios, String userCode, Long userCustomer) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userProfile = userProfile;
        this.userPhoneNumber = userPhoneNumber;
        this.userBios = userBios;
        this.userCode = userCode;
        this.userCustomer = userCustomer;
    }
    public User() { }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserBios() {
        return userBios;
    }

    public void setUserBios(String userBios) {
        this.userBios = userBios;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Long getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(Long userCustomer) {
        this.userCustomer = userCustomer;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userProfile='" + userProfile + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userBios='" + userBios + '\'' +
                ", userCode='" + userCode + '\'' +
                ", userCustomer=" + userCustomer +
                '}';
    }
}
