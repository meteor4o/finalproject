package com.softuni.finalproject.service.impl;

import com.softuni.finalproject.model.entity.UserEntity;
import com.softuni.finalproject.model.entity.enums.RoleNameEnum;
import com.softuni.finalproject.model.service.UserServiceModel;
import com.softuni.finalproject.repository.UserRepository;
import com.softuni.finalproject.service.UserService;
import org.modelmapper.ModelMapper;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        UserEntity user = modelMapper.map(userServiceModel, UserEntity.class);
        userRepository.save(user);
    }

    @Override
    public UserServiceModel findById(Long id) {

        return userRepository.
                findById(id).
                map(user -> modelMapper.map(user, UserServiceModel.class)).
                orElse(null);
    }
}
