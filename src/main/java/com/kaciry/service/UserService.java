package com.kaciry.service;

import com.kaciry.entity.User;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/18 11:36
 * @description
 */
public interface UserService {
    /**
     * @param name name
     * @return com.kaciry.entity.User
     * @author kaciry
     * @description
     * @date 2020/11/18 11:37
     **/
    User queryUserById(String name);

    /**
     * @author kaciry
     * @description
     * @date  2020/11/18 15:11
     * @return java.util.List<com.kaciry.entity.User>
    **/
    List<User> findAll();

    /**
     * @author kaciry
     * @description
     * @date  2020/11/18 14:33
     * @param name name
     * @param sex sex
     * @return boolean
    **/
    boolean insertUserInfo(String name,String sex);

    /**
     * @author kaciry
     * @description
     * @date  2020/11/18 14:57
     * @param id id
     * @return boolean
    **/
    boolean deleteUserById(Integer id);

    /**
     * @author kaciry
     * @description
     * @date  2020/11/18 15:02
     * @param id id
     * @param name name
     * @return boolean
    **/
    boolean updateUserInfo(Integer id,String name);
}
