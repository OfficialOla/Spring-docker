package org.example.services;

import org.example.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    User findById(Long id);

    ResponseEntity<?> deleteById(Long id);

    void deleteAll();
}
