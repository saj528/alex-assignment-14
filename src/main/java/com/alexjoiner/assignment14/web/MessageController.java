package com.alexjoiner.assignment14.web;

import com.alexjoiner.assignment14.domain.User;
import com.alexjoiner.assignment14.domain.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
public class MessageController {

    User currentUser;
    ArrayList<Message> messages = new ArrayList<>();

    @GetMapping("/welcome")
    public String getWelcomePage(String username){
        //System.out.println(username);
        return "welcome";
    }


    @PostMapping("/welcome")
    @ResponseBody
    public Boolean postWelcomePage(@RequestBody User user){
        currentUser = user;
        System.out.println(user.getChatUsername());
        System.out.println(user.getChatChannel());
        return true;
    }

    @GetMapping("/channel/{channelId}")
    public String getChannel(ModelMap modelMap){




        return "/channel/" + currentUser.getChatChannel();
    }

}
