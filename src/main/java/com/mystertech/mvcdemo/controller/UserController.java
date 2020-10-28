package com.mystertech.mvcdemo.controller;

import com.mystertech.mvcdemo.entity.User;
import com.mystertech.mvcdemo.exception.RecordNotFoundException;
import com.mystertech.mvcdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> users = userService.listUsers();
        return users;
    }

    @RequestMapping(path = "/users/register", method = RequestMethod.POST)
    public void createUser(@RequestBody User user){
        System.out.println(user.getFirstName());
        userService.addUser(user);
    }

    @PostMapping("/users/edit")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserByID(@PathVariable int id) throws RecordNotFoundException {
        User user = userService.getUserById(id);
        System.out.println(user.getId());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getEmail());
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        userService.removeUser(id);
    }
}
