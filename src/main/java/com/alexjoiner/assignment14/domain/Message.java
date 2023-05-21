package com.alexjoiner.assignment14.domain;


public class Message {

    private User user;
    private String message;
    private Channel channel;
    private int id;

    public Message(User user, String message, Channel channel, int id) {
        this.user = user;
        this.message = message;
        this.channel = channel;
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
