package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.Message;
import com.alexjoiner.assignment14.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    MessageRepository messageRepository;

    public MessageService() {
        messageRepository = new MessageRepository();
    }

    public void add(Message message) {
        messageRepository.add(message);
    }

    public List<Message> getChannelMessages(int channelId) {
        return messageRepository.getChannelMessages(channelId);
    }

}
