package com.kaciry.controller;

import com.kaciry.entity.Student;
import com.kaciry.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/17 17:22
 * @description
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param sno 主键
     * @return 单条数据
     */
    @GetMapping("queryById/{sno}")
    @ResponseBody
    public Student selectOne(@PathVariable String sno) {
        return studentService.queryById(sno);
    }

    /**
     * @return com.kaciry.entity.Student
     * @author kaciry
     * @description 查询所有学生
     * @date 2020/11/18 9:44
     **/
    @GetMapping(value = "/findAll")
    @ResponseBody
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
