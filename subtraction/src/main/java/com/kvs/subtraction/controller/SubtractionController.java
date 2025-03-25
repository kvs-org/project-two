package com.kvs.subtraction.controller;

import com.kvs.subtraction.service.SubtractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubtractionController {

    @Autowired
    private SubtractionService subtractionService;

    @GetMapping("/subtract")
    public ResponseEntity<Integer> subtract(@RequestParam int a, @RequestParam int b) {
        int result = subtractionService.subtract(a, b);
        return ResponseEntity.ok(result);
    }
}