package com.kaciry.controller;

import com.kaciry.entity.Student;
import com.kaciry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kaciry
 * @date 2020/11/17 17:22
 * @description
 */
@Controller
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Autowired
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Student selectOne(String id) {
        System.out.println(id);
        return this.studentService.queryById(id);
    }
}
