package com.kaciry.service;

import com.kaciry.entity.Student;

/**
 * @author kaciry
 * @date 2020/11/17 17:03
 * @description
 */
public interface StudentService {
    /**
     * @author kaciry
     * @description
     * @date  2020/11/17 17:04
     * @param id sno
     * @return com.kaciry.entity.Student
    **/
    Student queryById(String id);
}
