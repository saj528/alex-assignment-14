package com.alexjoiner.assignment14.domain;

import com.alexjoiner.assignment14.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


public class User {

    private String username;
    private String channelId;
    private int id;

    public User(String username, String channelId) {
        this.username = username;
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

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
}

