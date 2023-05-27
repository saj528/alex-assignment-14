package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.Channel;
import com.alexjoiner.assignment14.repository.ChannelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChannelService {

    ChannelRepository channelRepository;

    public ChannelService() {
        channelRepository = new ChannelRepository();
    }

    public ArrayList<Channel> getChannels() {
        return channelRepository.getChannels();
    }

}

