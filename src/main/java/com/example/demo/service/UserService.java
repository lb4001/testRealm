package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void addUser(User user){
        userRepository.save(user);
    }
}
