package com.monitoring.costs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dimab
 * @version monitoring-costs
 * @apiNote 29.03.2023
 */
@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping
    public String users() {
        return "Hello World!";
    }
}