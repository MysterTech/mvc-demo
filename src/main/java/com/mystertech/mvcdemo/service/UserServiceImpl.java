package com.mystertech.mvcdemo.service;

import com.mystertech.mvcdemo.entity.User;
import com.mystertech.mvcdemo.exception.RecordNotFoundException;
import com.mystertech.mvcdemo.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userRepository;

    @Override
    public void addUser(User user) {
    this.userRepository.saveAndFlush(user);
    }

    @Override
    public void updateUser(User user) {
        user.setId(user.getId());
        System.out.println(user.getId());
        this.userRepository.save(user);
        this.userRepository.flush();
    }

    @Override
    public List<User> listUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUserById(int id) throws RecordNotFoundException {
        Optional<User> user = this.userRepository.findById(id);

        if(user.isPresent()) {
            return user.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

    @Override
    public void removeUser(int id) {
        this.userRepository.deleteById(id);
    }
}
