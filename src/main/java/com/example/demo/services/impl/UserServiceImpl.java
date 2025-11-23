package com.example.demo.services.impl;

import com.example.demo.dto.ShowDetailedUserInfoDto;
import com.example.demo.dto.ShowUserInfoDto;
import com.example.demo.models.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.*;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public List<ShowUserInfoDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> modelMapper.map(user, ShowUserInfoDto.class))
                .toList();
    }

    public ShowDetailedUserInfoDto getUser(String id) {
        User user = userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found"));
        return modelMapper.map(user, ShowDetailedUserInfoDto.class);
    }

}

