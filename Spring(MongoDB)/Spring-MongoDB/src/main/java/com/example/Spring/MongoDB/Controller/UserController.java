package com.example.Spring.MongoDB.Controller;

import com.example.Spring.MongoDB.Model.User;
import com.example.Spring.MongoDB.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("add/user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

}
