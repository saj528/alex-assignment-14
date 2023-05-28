package com.alexjoiner.assignment14.repository;

import com.alexjoiner.assignment14.domain.ChatChannel;

import java.util.ArrayList;

public class ChannelRepository {

    ArrayList<ChatChannel> chatChannels = new ArrayList<>();

    public void add(ChatChannel chatChannel){
        chatChannels.add(chatChannel);
    }

    public ArrayList<ChatChannel> getChannels() {
        return chatChannels;
    }

}
