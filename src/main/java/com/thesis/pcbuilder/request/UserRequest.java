package com.thesis.pcbuilder.request;

import lombok.Getter;

@Getter
public class UserRequest {
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
}
