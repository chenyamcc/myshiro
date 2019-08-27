package com.chen.controller;

import com.chen.entity.User;
import com.chen.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Carl
 * @title: UserController
 * @description: 用户控制器
 * @date 2019/8/26 19:13
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("login")
    public ModelAndView login(User user, HttpSession session) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        Subject subject = SecurityUtils.getSubject();
        if (!subject.isAuthenticated()){
            // 如果用户没有认证,用户登录
            subject.login(token);
            User login = userService.selectByUsername(user.getUsername());
            session.setAttribute("user",login);
            modelAndView.setViewName("index");
        }
        return modelAndView;
    }
}
