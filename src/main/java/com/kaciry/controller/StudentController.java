package com.kaciry.controller;

import com.kaciry.entity.Student;
import com.kaciry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author kaciry
 * @date 2020/11/17 17:22
 * @description
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    /**
     * 服务对象
     */
    @Autowired
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param sno 主键
     * @return 单条数据
     */
    @GetMapping("queryById/{sno}")
    @ResponseBody
    public Student selectOne(@PathVariable String sno) {
        System.out.println("Args sno is : " + sno);
        Student student = studentService.queryById(sno);
        System.out.println("Result is : " + student);
        return student;
    }

}
