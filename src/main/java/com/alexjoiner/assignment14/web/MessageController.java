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
    public String getWelcomePage(){

        return "welcome";
    }


    @PostMapping("/welcome")
    @ResponseBody
    public String postWelcomePage(@RequestBody User user){

        userService.add(user);

        return "redirect:/channel/" + user.getChannelId();
    }




    @GetMapping("/channel/{channelId}")
    public String getChannel(ModelMap modelMap){
        Message message = new Message();

        modelMap.put("message",message);


        return "channel";
    }

    @PostMapping("/channel/{channelId}")
    public String postMessage(Message message){
        System.out.println(message.getUsername());


        return "redirect:/channel/" + message.getChannelId();
    }


}
