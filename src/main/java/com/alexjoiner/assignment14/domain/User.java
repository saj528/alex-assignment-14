package com.alexjoiner.assignment14.domain;

public class User {

    private String username;
    private int id;
    private int channelId;

    public User(String username, int id, int channelId) {
        this.username = username;
        this.id = id;
        this.channelId = channelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

}

