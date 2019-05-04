package com.xxx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody
@Controller*/
@RestController
public class HelloWord {



    @RequestMapping("/hello")
    public String hello() {

        return "Hello Word!!";
    }
}
