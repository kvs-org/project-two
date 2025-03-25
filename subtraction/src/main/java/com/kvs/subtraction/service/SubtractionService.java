package com.kvs.subtraction.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {

    public int subtract(int a, int b) {
        return a - b;
    }
}
