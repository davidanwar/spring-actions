package com.actions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spring")
public class TestController {

    @GetMapping("/actions")
    public ResponseEntity<ApiResponse> getActions() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setActions("Github Actions");
        apiResponse.setServer("DigitalOcean");
        return ResponseEntity.ok(apiResponse);
    }
}
