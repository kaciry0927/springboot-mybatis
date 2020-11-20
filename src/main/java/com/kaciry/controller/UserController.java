package com.kaciry.controller;

import com.kaciry.entity.User;
import com.kaciry.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map findAll() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("page", userService.findAll());
//        return modelAndView;
        List<User> users = userService.findAll();
        Map<String,Object> map = new HashMap<>();
        map.put("total",users.size());
        map.put("rows",users);
        return map;

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
