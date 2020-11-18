package com.kaciry.service;

import com.kaciry.entity.Student;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/17 17:03
 * @description
 */
public interface StudentService {
    /**
     * @param sno sno
     * @return com.kaciry.entity.Student
     * @author kaciry
     * @description
     * @date 2020/11/17 17:04
     **/
    Student queryById(String sno);

    /**
     * @param
     * @return com.kaciry.entity.Student
     * @author kaciry
     * @description
     * @date 2020/11/18 9:43
     **/
    List<Student> findAll();
}
