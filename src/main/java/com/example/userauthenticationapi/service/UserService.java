package com.example.userauthenticationapi.service;

import com.example.userauthenticationapi.dto.UserDto;
import com.example.userauthenticationapi.model.User;
import com.example.userauthenticationapi.dto.UserRegistrationDto;

public interface UserService {
    User registerNewUser(UserRegistrationDto registration);

    UserDto getUserByUsername(String username);

    User findByUsername(String username);
    User findByEmail(String email);
}
