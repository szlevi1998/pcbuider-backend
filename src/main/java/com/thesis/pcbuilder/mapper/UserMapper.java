package com.thesis.pcbuilder.mapper;

import com.thesis.pcbuilder.model.User;
import com.thesis.pcbuilder.request.UserRequest;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {
    public User mapToUser(UserRequest userRequest){
        return User.builder()
                .username(userRequest.getUsername())
                .password(userRequest.getPassword())
                .email(userRequest.getEmail())
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .build();
    }
}
