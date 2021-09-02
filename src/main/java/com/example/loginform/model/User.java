package com.example.loginform.model;

public class User {

    private int userId;
    private String profilePicUrl;
    private String name;
    private String description;

    public User(int userId, String profilePicUrl, String name, String description) {
        this.userId = userId;
        this.profilePicUrl = profilePicUrl;
        this.name = name;
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProfilePicUrl() {
        return profilePicUrl;
    }

    public void setProfilePicUrl(String profilePicUrl) {
        this.profilePicUrl = profilePicUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
