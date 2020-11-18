package com.kaciry.service.Impl;

import com.kaciry.entity.User;
import com.kaciry.mapper.UserMapper;
import com.kaciry.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kaciry
 * @date 2020/11/18 11:38
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryUserById(Integer id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public boolean insertUserInfo(String name, String sex) {
        return userMapper.insertUserInfo(name,sex);
    }

    @Override
    public boolean deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public boolean updateUserInfo(Integer id, String name) {
        return userMapper.updateUserInfo(id,name);
    }
}
