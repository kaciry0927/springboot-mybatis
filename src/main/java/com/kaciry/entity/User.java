package com.kaciry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author kaciry
 * @date 2020/11/18 11:20
 * @description mybatis表
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String sex;
}
