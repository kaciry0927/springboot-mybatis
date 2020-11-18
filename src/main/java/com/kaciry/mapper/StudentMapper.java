package com.kaciry.mapper;

import com.kaciry.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/17 17:00
 * @description
 */
@Mapper
@Repository
public interface StudentMapper {
    /**
     * @param sno sno
     * @return Student
     */
    Student queryById(String sno);
    /**
     * @author kaciry
     * @description
     * @date  2020/11/18 9:42
     * @return com.kaciry.entity.Student
    **/
    List<Student> findAll();
}
