package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void add(User user) {
        users.add(user);
    }
}
