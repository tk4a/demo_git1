package com.example.demo_git.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController {

    @GetMapping
    fun hello() = "Hello"

    @GetMapping("/hello")
    fun hello2() = "Hello man"
		
}
