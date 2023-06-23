package com.example.demo.web;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/allUsers")
    public List<User> findAll(){
        return userService.findAll();
    }
    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
