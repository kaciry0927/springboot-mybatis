package com.kaciry.controller;

import com.alibaba.fastjson.JSONObject;
import com.kaciry.entity.User;
import com.kaciry.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/18 11:41
 * @description UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //不能只new一个ModelAndView对象
    //private ModelAndView modelAndView = new ModelAndView("index");

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("queryUserByName")
    public List<User> queryUserById(String name) {
        //ModelAndView modelAndView = new ModelAndView("index");
        //modelAndView.addObject("respQueryByName", userService.queryUserById(name));
        //List<User> users = userService.queryUserById(name);
        //Map<String,Object> map = new HashMap<>();
        //map.put("total",users.size());
        //map.put("rows",users);
        return userService.queryUserById(name);
    }

    @PostMapping("findAll")
    public JSONObject findAll() {
        JSONObject jsonObject = new JSONObject();
        List<User> users = userService.findAll();
        //Map<String, Object> map = new HashMap<>();
        jsonObject.put("total", users.size());
        jsonObject.put("rows", users);
        //map.put("total", users.size());
        //map.put("rows", users);
        //String str = jsonObject.toJSONString();
        //System.out.println(str);
        //String str2 = JSONObject.toJSONString(jsonObject,false);
        //System.out.println(str2);
        //return JSONObject.toJSONString(jsonObject,false);
        return jsonObject;
    }

    @PostMapping("insertUser")
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
    public ModelAndView deleteUserById(Integer id) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("deleteById", userService.deleteUserById(id));
        return modelAndView;
    }

    @PostMapping("updateUserById")
    public ModelAndView deleteUserById(Integer id, String name) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("updateById", userService.updateUserInfo(id, name));
        return modelAndView;
    }
}
