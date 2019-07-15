package com.example.boot.elasticsearch.controller;

import com.example.boot.elasticsearch.entity.User;
import com.example.boot.elasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: huangwh
 * @mail huangwh@txtws.com
 * @date: 2019-07-12 13:35
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public boolean insert(@RequestBody User user) {
        return userService.insert(user);
    }
}
