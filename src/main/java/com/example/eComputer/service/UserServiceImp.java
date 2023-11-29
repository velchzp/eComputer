package com.example.eComputer.service;

import com.example.eComputer.domain.UserEntity;
import com.example.eComputer.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public Optional<UserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean exists(String email) {
        return false;
    }

    @Override
    public UserEntity save(UserEntity student) {
        return userRepository.save(student);
    }
}
