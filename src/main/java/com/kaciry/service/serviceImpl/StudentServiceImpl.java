package com.kaciry.service.serviceImpl;

import com.kaciry.dao.StudentDao;
import com.kaciry.entity.Student;
import com.kaciry.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kaciry
 * @date 2020/11/17 17:05
 * @description
 */
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student queryById(Integer id) {
        return this.studentDao.queryById(id);
    }
}
