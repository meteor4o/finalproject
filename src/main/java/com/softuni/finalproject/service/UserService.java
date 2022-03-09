package com.softuni.finalproject.service;

import com.softuni.finalproject.model.service.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findById(Long id);
}
