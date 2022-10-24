package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/v1")
public class SampleController {

    @GetMapping(value="/test")
    public String test() {
        return "test completed";
    }
}
