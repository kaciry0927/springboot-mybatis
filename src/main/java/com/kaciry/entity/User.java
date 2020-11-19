package com.kaciry.entity;

import com.sun.istack.internal.NotNull;
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
    @NotNull
    private String name;
    @NotNull
    private String sex;
}
