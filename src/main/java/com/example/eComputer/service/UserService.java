package com.example.eComputer.service;
import com.example.eComputer.domain.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService{
    public Optional<UserEntity> getUserById(Long id);
//    public UserEntity getStudentByName(String name);
    public List<UserEntity> getAllUsers();
    public boolean exists(String email);
    public UserEntity save(UserEntity student);
}
