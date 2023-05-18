package com.alexjoiner.assignment14.domain;

public class Message {

    private String username;
    private String channel;
    private String message;
    private int id;

    public Message(String username, String channel, String message, int id) {
        this.username = username;
        this.channel = channel;
        this.message = message;
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
