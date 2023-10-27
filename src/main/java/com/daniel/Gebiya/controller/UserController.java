package com.daniel.Gebiya.controller;

import com.daniel.Gebiya.model.User;
import com.daniel.Gebiya.view.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser =userService.findAllUser();
        return  new ResponseEntity<>(allUser, HttpStatus.OK);
    }
    @GetMapping("/getSingleUser/{id}")
    public ResponseEntity<User> getSingleUser(@PathVariable("id") Long id ){
        User allUser =userService.findUserByUserId(id);
        return  new ResponseEntity<>(allUser, HttpStatus.OK);
    }
}
