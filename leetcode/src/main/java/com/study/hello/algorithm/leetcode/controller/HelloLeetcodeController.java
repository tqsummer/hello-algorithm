package com.study.hello.algorithm.leetcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fangxiangqian
 */
@Controller
@RequestMapping("/leetcode")
public class HelloLeetcodeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "";
    }
}
