package com.mycompany.restreverse.service;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {

    public String reverseData(String inputData) {
        return new StringBuilder(inputData).reverse().toString();
    }
}
