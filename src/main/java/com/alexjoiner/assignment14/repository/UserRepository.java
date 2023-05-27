package com.alexjoiner.assignment14.repository;

import com.alexjoiner.assignment14.domain.User;

import java.util.ArrayList;

public class UserRepository {

    ArrayList<User> users = new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void add(User user) {
        users.add(user);
    }

}
