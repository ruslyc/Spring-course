package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("home")
public class HomeController {
    @RequestMapping("/get")
    public String getRequestMapping() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/get")
    public String getRequestMapping1() {
        return "home";
    }

    @GetMapping("/get_page")
    public String getRequestMapping2() {
        return "getPage";
    }

    @PostMapping("/post_page")
    public String getRequestMapping3() {
        return "postPage";
    }

    @GetMapping("/path/{name}")
    public String pathVariableExample(@PathVariable String name){
        System.out.println("The name is "+  name);
        return "home";
    }

    @GetMapping("/request/course")
    public String requestParamExample(@RequestParam String course){
        System.out.println("The name is "+  course);
        return "home";
    }

}
