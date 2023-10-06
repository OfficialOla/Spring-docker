package org.example.services;

import lombok.AllArgsConstructor;
import org.example.models.User;
import org.example.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
       user.setId(user.getId());
       user.setCentreName(user.getCentreName());
       user.setFullName(user.getFullName());
       User savedUser = userRepository.save(user);
       return savedUser;
    }




    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> foundUser = userRepository.findById(id);
        return foundUser.orElseThrow(() ->
                new IllegalArgumentException(
                        "User not found"
                ));
    }

    @Override
    public ResponseEntity<?> deleteById(Long id) {
        userRepository.deleteById(id);
        return null;
    }

    @Override
    public void deleteAll() {
    userRepository.deleteAll();
    }
}
