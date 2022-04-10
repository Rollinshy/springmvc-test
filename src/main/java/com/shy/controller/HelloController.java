package com.shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController  {
    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("msg","hello,springmvc");
        return "hello";
    }
}
