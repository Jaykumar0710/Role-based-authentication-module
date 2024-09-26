package com.jay.SecurityModuleRoleBased.service;

import com.jay.SecurityModuleRoleBased.Repository.UserRepository;
import com.jay.SecurityModuleRoleBased.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getUsername()));
        userRepository.save(user);
    }

    public List<User>getAllUser(){
        return userRepository.findAll();
    }

    public void deleteUser(Long id){
        userRepository.deleteAll();
    }

    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

}
