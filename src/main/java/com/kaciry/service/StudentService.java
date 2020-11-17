package com.kaciry.service;

import com.kaciry.entity.Student;
import org.springframework.stereotype.Service;

/**
 * @author kaciry
 * @date 2020/11/17 17:03
 * @description
 */
@Service
public interface StudentService {
    /**
     * @author kaciry
     * @description
     * @date  2020/11/17 17:04
     * @param id sno
     * @return com.kaciry.entity.Student
    **/
    Student queryById(Integer id);
}
