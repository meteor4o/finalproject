package com.softuni.finalproject.service.impl;

import com.softuni.finalproject.model.entity.CustomerEntity;
import com.softuni.finalproject.model.service.CustomerServiceModel;
import com.softuni.finalproject.repository.CustomerRepository;
import com.softuni.finalproject.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CustomerServiceModel findByEmail(String email) {
        return customerRepository.
        findByEmail(email).
        map(customer -> modelMapper.map(customer, CustomerServiceModel.class)).
        orElse(null);
    }
}
