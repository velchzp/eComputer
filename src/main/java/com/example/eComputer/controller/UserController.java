package com.example.eComputer.controller;

import com.example.eComputer.domain.UserEntity;
import com.example.eComputer.dto.UserPartDTO;
import com.example.eComputer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<UserEntity>createStudent(@RequestBody UserPartDTO user_data) {
        UserEntity user = new UserEntity();

        user.setName(user_data.getName());
        user.setEmail(user_data.getEmail());
        user.setPassword(user.getPassword());
        user.setBirthday(user_data.getBirthday());

        UserEntity savedUser = userService.save(user);
        HttpStatus status = HttpStatus.CREATED;
        UserEntity saved = userService.save(user);
        return new ResponseEntity<>(saved, status);
    }
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable Long id){
        Optional<UserEntity> useroptional = userService.getUserById(id);
        return useroptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
