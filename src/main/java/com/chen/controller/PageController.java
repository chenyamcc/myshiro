package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Carl
 * @title: PageController
 * @description: 跳转页面的处理器
 * @date 2019/8/26 19:14
 */
@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping("index")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
}
