package com.mycompany.restreverse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    @GetMapping("/reverse/")
    public ResponseEntity<String> getReversedString(@RequestParam String inputData) {
        var reversedData = new StringBuilder(inputData).reverse().toString();
        return ResponseEntity.ok(reversedData);
    }
}
