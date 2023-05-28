package com.alexjoiner.assignment14.domain;

public class User {

    private String username;
    private int channelId;
    private int id;

    public User(String username, int channelId, int id) {
        this.username = username;
        this.channelId = channelId;
        this.id = id;
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

