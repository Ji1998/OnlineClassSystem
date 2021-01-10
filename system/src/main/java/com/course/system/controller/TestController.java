package com.course.system.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//如果返回的是JSON数据用RestController，如果返回的是页面用Controller
@RestController


public class TestController {

    @RequestMapping("/test")
    public String test()
    {
        return "success";

    }

}
