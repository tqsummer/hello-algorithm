package com.study.hello.algorithm.tuling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fangxiangqian
 */
@Controller
@RequestMapping("/tuling")
public class HelloTulingController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "";
    }
}
