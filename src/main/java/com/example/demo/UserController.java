package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo){
        this.repo = repo;
    }

    @GetMapping("/")
    public String home(){
        return "Spring Boot is running";
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return repo.findAll();
    }
}