package com.mycompany.restreverse.controller;

import com.mycompany.restreverse.service.ReverseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    private final ReverseService reverseService;

    public ReverseController(ReverseService reverseService) {
        this.reverseService = reverseService;
    }

    @GetMapping("/reverse")
    public ResponseEntity<String> getReversedString(@RequestParam String inputData) {
        var reversedData = reverseService.reverseData(inputData);
        return ResponseEntity.ok(reversedData);
    }
}
