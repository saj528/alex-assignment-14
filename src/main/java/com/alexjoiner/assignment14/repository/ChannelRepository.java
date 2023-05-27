package com.alexjoiner.assignment14.repository;

import com.alexjoiner.assignment14.domain.Channel;
import com.alexjoiner.assignment14.service.ChannelService;

import java.util.ArrayList;

public class ChannelRepository {

    ArrayList<Channel> channels = new ArrayList<>();

    public void add(Channel channel){
        channels.add(channel);
    }

    public ArrayList<Channel> getChannels() {
        return channels;
    }

}
