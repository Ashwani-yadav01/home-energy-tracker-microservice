package com.ashwani.user_service.service;

import com.ashwani.user_service.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto input);
    UserDto getUserById(Long id);
    void updateUser(Long id,UserDto dto);
    void deleteUser(Long id);

}
