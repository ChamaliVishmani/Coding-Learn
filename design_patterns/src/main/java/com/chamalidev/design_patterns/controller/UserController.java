package com.chamalidev.design_patterns.controller;

import com.chamalidev.design_patterns.service.ObserverNotification.Impl.EmailObserver;
import com.chamalidev.design_patterns.service.ObserverNotification.Impl.SMSObserver;
import com.chamalidev.design_patterns.service.ObserverNotification.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(){
        this.userService = new UserService();

        //register observers
        userService.registerObserver(new EmailObserver());
        userService.registerObserver(new SMSObserver());
        // Both EmailObserver and SMSObserver are registered with UserService, so they are notified whenever a user registers.
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestParam String username){
        userService.registerUser(username);
        return ResponseEntity.ok("User registered and notifications sent!");
    }
}
