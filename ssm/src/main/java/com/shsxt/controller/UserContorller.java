package com.shsxt.controller;

import com.shsxt.po.User;
import com.shsxt.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserContorller {
    @Resource
    public UserService userService;

    @RequestMapping("query")
    @ResponseBody
    public User queryById(Integer id) throws Exception {
        return  userService.queryById(id);
    }
}
