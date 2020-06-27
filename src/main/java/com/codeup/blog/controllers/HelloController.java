package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @GetMapping("/hello")  //URL to map on a GET METHOD  /hello
    @ResponseBody //makes a response to be plain text
    public String hello() {
        return "Hello from spring";
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome";
    }


}
