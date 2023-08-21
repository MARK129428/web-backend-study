package com.hhk.hanlinxuefu.controller;

import com.hhk.hanlinxuefu.entry.User;
import com.hhk.hanlinxuefu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")  // 添加这一行来指定类级别的路径前缀
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login/{id}")
    public User login(@PathVariable Integer id) {
        return userService.login(id);
    }

}

