package com.chamalidev.design_patterns.controller;

import com.chamalidev.design_patterns.service.SingletonLogger.LoggerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @GetMapping("/log")
    public ResponseEntity<String> logMessage(){
        // accessing the singleton instance of the LoggerService,
        // instead of creating a new instance
        LoggerService logger = LoggerService.getInstance();
        logger.log("Log message");
        return ResponseEntity.ok("Message logged");
    }
}
