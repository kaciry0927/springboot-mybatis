package com.kaciry.controller;

import com.kaciry.entity.User;
import com.kaciry.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/18 11:41
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("queryUserById/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable Integer id) {
        return userService.queryUserById(id);
    }

    @GetMapping("findAll")
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("insertUser/{name}/{sex}")
    @ResponseBody
    public boolean insertUserInfo(@PathVariable String name, @PathVariable String sex) {
        return userService.insertUserInfo(name, sex);
    }

    @GetMapping("deleteUserById/{id}")
    @ResponseBody
    public boolean deleteUserById(@PathVariable Integer id) {
        return userService.deleteUserById(id);
    }

    @GetMapping("updateUserById/{id}/{name}")
    @ResponseBody
    public boolean deleteUserById(@PathVariable Integer id,@PathVariable String name) {
        return userService.updateUserInfo(id,name);
    }
}