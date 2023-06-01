package com.alexjoiner.assignment14.web;

import com.alexjoiner.assignment14.domain.Message;
import com.alexjoiner.assignment14.domain.User;
import com.alexjoiner.assignment14.service.MessageService;
import com.alexjoiner.assignment14.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MessageController {

    UserService userService;
    MessageService messageService;


    @Autowired
    public MessageController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
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

    @PostMapping("/add-user")
    @ResponseBody
    public Boolean postUser(@RequestBody User user) {
        user.setId(userService.getUsers().size() + 1);
        System.out.println(user.getUsername());
        userService.add(user);
        return true;
    }

    @PostMapping("/does-username-exist")
    @ResponseBody
    public Boolean doesUsernameExist(@RequestBody User user) {
        for (User tempUser : userService.getUsers()) {
            System.out.println(tempUser.getUsername().equals(user.getUsername()));
            if (tempUser.getUsername().equals(user.getUsername())) {
                System.out.println("firing");
                return true;
            }
        }

        return false;
    }

    @GetMapping("/are-there-users-check")
    @ResponseBody
    public ResponseEntity<Boolean> areThereUsersCheck() {
        System.out.println(userService.getUsers().isEmpty());
        return ResponseEntity.ok(userService.getUsers().isEmpty());
    }

    @GetMapping("/get-messages/{channelId}")
    @ResponseBody
    public List<Message> postMessage(@PathVariable int channelId) {

        return messageService.getChannelMessages(channelId);

    }

    @PostMapping("/does-user-exist")
    @ResponseBody
    public Boolean doesUserExist(@RequestBody User user) {
        System.out.println("firing");
        Boolean containsUser = false;
        if (user != null) {
            for (User tempUser : userService.getUsers()) {
                System.out.println(tempUser.getUsername() + ": Temp User");
                System.out.println(user.getUsername() + ": User");
                if (tempUser.getUsername().equals(user.getUsername())) {
                    containsUser = true;
                }
            }
        }

        return containsUser;

    }


}
