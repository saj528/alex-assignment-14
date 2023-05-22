package com.alexjoiner.assignment14.domain;


public class Message {

    private String username;
    private String message;
    private int channelId;
    private int id;

    public Message(String username, String message, int channelId) {
        this.username = username;
        this.message = message;
        this.channelId = channelId;
    }

    public Message() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
