package com.slash.lash.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.slash.lash.model.UserModel;
import com.slash.lash.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    public UserModel updateUser(UserModel user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserModel getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }
}
