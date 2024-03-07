package com.example.bff.controller;

import com.example.bff.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity <List<UserDto>> getUsers() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
