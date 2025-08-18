package com.slash.lash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.slash.lash.model.UserModel;
import com.slash.lash.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public UserModel postMethodName(@RequestBody UserModel userModel) {
        return this.userService.createUser(userModel);
    }

    @GetMapping("/update")
    public UserModel getMethodName(@RequestBody UserModel userModel) {
        return this.userService.updateUser(userModel);
    }

    @GetMapping("/delete")
    public void deleteMethodName(@RequestParam Long id) {
        this.userService.deleteUser(id);
    }

    @GetMapping("/get")
    public UserModel getMethodName(@RequestParam Long id) {
        return this.userService.getUserById(id);
    }
}
