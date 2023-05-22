package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MessageService {

    ArrayList<Message> messages = new ArrayList<>();;

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public void add(Message message) {
        messages.add(message);
    }
}
