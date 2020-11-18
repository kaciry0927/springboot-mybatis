package com.kaciry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author kaciry
 * @date 2020/11/17 16:58
 * @description 学生实体
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String sno;
    private String sname;
    private String sage;
    private String ssex;
}
