package com.xxx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping({"/success"})
    public String success(){
        return "success";
    }
}
