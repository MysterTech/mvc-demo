package com.mystertech.mvcdemo.service;

import com.mystertech.mvcdemo.entity.User;
import com.mystertech.mvcdemo.exception.RecordNotFoundException;

import java.util.List;

public interface UserService {

    public void addUser(User user);
    public void updateUser(User user);
    public List<User> listUsers();
    public User getUserById(int id) throws RecordNotFoundException;
    public void removeUser(int id);

}