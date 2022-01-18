package com.practice.librarysystem.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class test {
    @GetMapping("/test")
    fun sayHi() : String{
        return "Hello. This is test page."
    }

    @GetMapping("/")
    fun index() : String{
        return "hello world"
    }
}