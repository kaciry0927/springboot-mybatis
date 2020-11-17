package com.kaciry.dao;

import com.kaciry.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author kaciry
 * @date 2020/11/17 17:00
 * @description
 */
@Mapper
@Repository
public interface StudentDao {
    /**
     * @param id sno
     * @return Student
     */
    Student queryById(Integer id);
}
