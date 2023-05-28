package com.alexjoiner.assignment14.service;

import com.alexjoiner.assignment14.domain.User;
import com.alexjoiner.assignment14.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public LinkedHashSet<User> getUsers() {
        return userRepository.getUsers();
    }

    public void add(User user) {
        userRepository.add(user);
    }
}
