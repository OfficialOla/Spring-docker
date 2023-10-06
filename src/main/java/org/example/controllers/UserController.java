package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.models.User;
import org.example.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(User user){
        var response = userService.save(user);
        return ResponseEntity.ok(response);
    }
    @GetMapping(path = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> response = userService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/user")
    public ResponseEntity<?> getUser(Long id){
        var response = userService.findById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }
  @GetMapping("/delete")
    public ResponseEntity<?> deleteById(Long id){
      return userService.deleteById(id);
  }
}
