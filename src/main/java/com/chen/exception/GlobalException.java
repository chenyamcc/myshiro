package com.chen.exception;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Carl
 * @title: GlobalException
 * @description: 全局异常处理器
 * @date 2019/8/26 19:41
 */
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView view = new ModelAndView();
        e.printStackTrace();
        //判断异常类型
        if (e instanceof UnknownAccountException) {
            //用户名不存在
            view.setViewName("login");
            view.addObject("message", "用户名不存在");
        } else if (e instanceof IncorrectCredentialsException) {
            //密码错误
            view.setViewName("login");
            view.addObject("message", "密码不正确");
        } else if (e instanceof UnauthorizedException) {
            view.setViewName("500");
            view.addObject("message", "权限不足");
        } else {
            view.setViewName("500");
            view.addObject("message", "服务器异常");
        }
        return view;
    }
}
