package com.example.jenkinsboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Copyright (C), 2019, 弗恩天下
 * @Author: 渠猛
 * @Date: 2020/6/8 0008 下午 8:01
 * @Description:
 */
@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    private String test(){
        return "hello world1";
    }

}
