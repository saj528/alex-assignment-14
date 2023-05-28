package com.alexjoiner.assignment14.repository;

import com.alexjoiner.assignment14.domain.User;

import java.util.LinkedHashSet;

public class UserRepository {

    LinkedHashSet<User> users = new LinkedHashSet<>();

    public LinkedHashSet<User> getUsers() {
        return users;
    }

    public void add(User user) {
        users.add(user);
    }

}
