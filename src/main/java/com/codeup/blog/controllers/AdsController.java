package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdsController {

    @GetMapping("/ads")
    //@RequestMapping(value = "/ads", method = RequestMethod.GET)
    @ResponseBody
    public String index(){   //show list of ads = index of things
        return "ads index page";
    }

    @GetMapping("/ads/{id}")
    @ResponseBody
    public String showAd(@PathVariable long id) {
        return "show ad id: " + id;
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String showForm(){
        return "View the form for creating an ad";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String save(){
        return "create a new ad";
    }

}
