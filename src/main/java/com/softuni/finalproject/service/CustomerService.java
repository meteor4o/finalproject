package com.softuni.finalproject.service;

import com.softuni.finalproject.model.service.CustomerServiceModel;

public interface CustomerService {


    CustomerServiceModel findByEmail(String email);
}
