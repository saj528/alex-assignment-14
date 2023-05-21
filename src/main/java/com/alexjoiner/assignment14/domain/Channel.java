package com.alexjoiner.assignment14.domain;

import java.util.ArrayList;

public class Channel {

    private ArrayList<Message> messages;
    private int id;

    public Channel(ArrayList<Message> messages, int id) {
        this.messages = messages;
        this.id = id;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
