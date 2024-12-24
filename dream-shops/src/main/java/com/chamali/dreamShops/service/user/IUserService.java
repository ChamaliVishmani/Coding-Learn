package com.chamali.dreamShops.service.user;

import com.chamali.dreamShops.model.User;
import com.chamali.dreamShops.request.CreateUserRequest;
import com.chamali.dreamShops.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);
}
