package com.example.spring.spring.boot.repository;


import com.example.spring.spring.boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();
    User findUserById(Long id);
}
