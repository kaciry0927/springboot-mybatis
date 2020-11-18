package com.kaciry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author kaciry
 * @date 2020/11/18 16:51
 * @description
 */
@Controller
public class WebController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
