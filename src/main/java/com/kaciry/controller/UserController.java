package com.kaciry.controller;

import com.kaciry.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kaciry
 * @date 2020/11/18 11:41
 * @description
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    //不能只new一个ModelAndView对象
    //private ModelAndView modelAndView = new ModelAndView("index");

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("queryUserByName")
    @ResponseBody
    public ModelAndView queryUserById(String name) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("respQueryByName", userService.queryUserById(name));
        return modelAndView;
    }

    @PostMapping("findAll")
    @ResponseBody
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("list", userService.findAll());
        return modelAndView;
    }

    @PostMapping("insertUser")
    @ResponseBody
    public ModelAndView insertUserInfo(String name, String sex) {
        ModelAndView modelAndView = new ModelAndView("index");
        if (userService.insertUserInfo(name, sex)) {
            modelAndView.addObject("insertFlag", true);
            modelAndView.addObject("insertText", "Insert Successful!");
        } else {
            modelAndView.addObject("insertFlag", false);
            modelAndView.addObject("insertText", "Insert Error!");
        }
        return modelAndView;
    }

    @PostMapping("deleteUserById")
    @ResponseBody
    public ModelAndView deleteUserById(Integer id) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("deleteById", userService.deleteUserById(id));
        return modelAndView;
    }

    @PostMapping("updateUserById")
    @ResponseBody
    public ModelAndView deleteUserById(Integer id,String name) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("updateById", userService.updateUserInfo(id, name));
        return modelAndView;
    }
}
