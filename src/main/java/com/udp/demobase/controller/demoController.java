package com.udp.demobase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class demoController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
}
