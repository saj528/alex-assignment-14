package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.Channel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChannelService {

    ArrayList<Channel> channels = new ArrayList<>();

    public ArrayList<Channel> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<Channel> channels) {
        this.channels = channels;
    }

}

