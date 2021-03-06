package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{a}/and/{b}")
    @ResponseBody
    public int add(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    @GetMapping("/subtract/{a}/from/{b}")
    @ResponseBody
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return b-a;
    }

    @GetMapping("/multiply/{x}/and/{y}")
    @ResponseBody
    public int multiply(@PathVariable int x, @PathVariable int y){
        return x * y;
    }

    @GetMapping("/divide/{x}/by/{y}")
    @ResponseBody
    public int divide (@PathVariable int x, @PathVariable int y){
        return x/y;
    }

}
