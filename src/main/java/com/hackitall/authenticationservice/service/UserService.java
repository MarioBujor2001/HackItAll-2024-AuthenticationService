package com.hackitall.authenticationservice.service;

import com.hackitall.authenticationservice.entity.RegisterRequest;
import com.hackitall.authenticationservice.entity.User;
import com.hackitall.authenticationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(RegisterRequest registerRequest) throws Exception {
        if(userRepository.findByEmail(registerRequest.getEmail()) == null){
            User user = new User();
            user.setEmail(registerRequest.getEmail());
            user.setPassword(registerRequest.getPassword());
            userRepository.save(user);
            return user;
        } else {
            throw new Exception("User already registered!");
        }
    }
}
