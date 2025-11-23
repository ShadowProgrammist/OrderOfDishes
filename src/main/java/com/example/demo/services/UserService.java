package com.example.demo.services;

import com.example.demo.dto.ShowDetailedUserInfoDto;
import com.example.demo.dto.ShowUserInfoDto;

import java.util.List;

public interface UserService {
    public ShowDetailedUserInfoDto getUser(String id);

    public List<ShowUserInfoDto> getAllUsers();
}
