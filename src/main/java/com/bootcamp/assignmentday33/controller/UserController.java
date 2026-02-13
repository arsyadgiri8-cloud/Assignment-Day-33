package com.bootcamp.assignmentday33.controller;

import com.bootcamp.assignmentday33.entity.User;
import com.bootcamp.assignmentday33.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserController {

    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo=repo;
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return repo.save(user);
    }

    @GetMapping
    public List<User> getAll() {
        return repo.findAll();
    }
}
