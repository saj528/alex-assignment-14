package com.alexjoiner.assignment14.repository;

import com.alexjoiner.assignment14.domain.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageRepository {

    ArrayList<Message> messages = new ArrayList<>();

    public void add(Message message) {
        messages.add(message);
    }

    public List<Message> getChannelMessages(int channelId) {

        List<Message> tempMessages = new ArrayList<>();

        for(Message message : messages){
            if(message.getChannelId() == channelId){
                tempMessages.add(message);
            }
        }
        return tempMessages;
    }

}
