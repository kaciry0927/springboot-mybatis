package com.kaciry.service.Impl;

import com.kaciry.dao.StudentDao;
import com.kaciry.entity.Student;
import com.kaciry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaciry
 * @date 2020/11/17 17:05
 * @description
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student queryById(String id) {
        return this.studentDao.queryById(id);
    }
}