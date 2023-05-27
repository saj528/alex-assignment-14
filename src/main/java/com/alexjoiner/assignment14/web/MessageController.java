package com.alexjoiner.assignment14.web;

import com.alexjoiner.assignment14.domain.User;
import com.alexjoiner.assignment14.domain.Message;
import com.alexjoiner.assignment14.service.ChannelService;
import com.alexjoiner.assignment14.service.MessageService;
import com.alexjoiner.assignment14.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class MessageController {

    UserService userService;
    MessageService messageService;
    ChannelService channelService;

    @Autowired
    public MessageController(UserService userService, MessageService messageService, ChannelService channelService) {
        this.userService = userService;
        this.messageService = messageService;
        this.channelService = channelService;
    }

    @GetMapping("/welcome")
    public String getWelcomePage() {

        return "welcome";
    }

    @GetMapping("/channel/{channelId}")
    public String getChannel(ModelMap modelMap, @PathVariable int channelId) {

        if (!messageService.getChannelMessages(channelId).isEmpty()) {
            modelMap.put("messages", messageService.getChannelMessages(channelId));
        }

        return "channel";

    }

    @PostMapping("/add-message")
    @ResponseBody
    public Boolean postMessage(@RequestBody Message message) {
        messageService.add(message);
        return true;
    }

    @GetMapping("/get-messages/{channelId}")
    @ResponseBody
    public List<Message> postMessage(@PathVariable int channelId) {


        return messageService.getChannelMessages(channelId);

    }

}
