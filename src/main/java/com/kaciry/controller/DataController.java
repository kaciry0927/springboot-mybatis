package com.kaciry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kaciry
 * @date 2020/11/19 14:40
 * @description
 */
@Controller
@RequestMapping("/user")
public class DataController {
    private ModelAndView modelAndView = new ModelAndView("index");

    @GetMapping(value = "deleteForm")
    @ResponseBody
    public ModelAndView deleteForm(){
        modelAndView.addObject("deleteFlag",true);
        return modelAndView;
    }
}
