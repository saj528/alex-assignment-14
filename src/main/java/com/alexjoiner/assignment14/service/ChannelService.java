package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.ChatChannel;
import com.alexjoiner.assignment14.repository.ChannelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChannelService {

    ChannelRepository channelRepository;

    public ChannelService() {
        channelRepository = new ChannelRepository();
    }

    public ArrayList<ChatChannel> getChannels() {
        return channelRepository.getChannels();
    }

    public void add(ChatChannel chatChannel) {
        System.out.println("runts");
        channelRepository.add(chatChannel);
        System.out.println(chatChannel);
    }
}

