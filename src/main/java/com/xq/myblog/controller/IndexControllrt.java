package com.xq.myblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexControllrt {
    @GetMapping("/index")
    public String test() {
        return "Hello world!";
    }
}
