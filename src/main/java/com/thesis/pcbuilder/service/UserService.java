package com.thesis.pcbuilder.service;

import com.thesis.pcbuilder.exception.UserAlreadyExistsException;
import com.thesis.pcbuilder.mapper.UserMapper;
import com.thesis.pcbuilder.repository.UserRepository;
import com.thesis.pcbuilder.request.UserLoginRequest;
import com.thesis.pcbuilder.request.UserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public boolean authenticate(UserLoginRequest userLoginRequest) {
        return userRepository.existsByUsernameAndPassword(userLoginRequest.getUsername(), userLoginRequest.getPassword());
    }

    public void createUser(UserRequest userRequest) {
        if(userRepository.existsByUsername(userRequest.getUsername())){
            throw new UserAlreadyExistsException("The username is already taken");
        }
        userRepository.save(userMapper.mapToUser(userRequest));
    }
}

