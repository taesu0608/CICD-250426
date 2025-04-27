package org.example.cicd250426.domain.User.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // 루트 경로 (GET /)
    @GetMapping("/")
    public String home() {
        return "Hello from UserControllerqwe!";
    }
}