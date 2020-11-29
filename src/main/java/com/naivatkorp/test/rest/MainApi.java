package com.naivatkorp.test.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(path = "main")
public class MainApi {

    // This is test API
    @GetMapping(path = "test")
    public ResponseEntity<Map<String, String>> test() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "OK");
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "test-2")
    public ResponseEntity<Map<String, String>> test2() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "OK");
        return ResponseEntity.ok(response);
    }

//    @GetMapping(path = "test-3")
//    public ResponseEntity<Map<String, String>> test3() {
//        Map<String, String> response = new HashMap<>();
//        response.put("status", "OK");
//        return ResponseEntity.ok(response);
//    }
}
