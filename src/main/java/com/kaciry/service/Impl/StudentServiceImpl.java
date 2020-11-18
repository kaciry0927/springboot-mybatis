package com.kaciry.service.Impl;

import com.kaciry.entity.Student;
import com.kaciry.mapper.StudentMapper;
import com.kaciry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/17 17:05
 * @description
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryById(String sno) {
        return this.studentMapper.queryById(sno);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }
}
