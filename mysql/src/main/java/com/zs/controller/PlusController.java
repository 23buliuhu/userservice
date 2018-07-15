package com.zs.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zs.domain.User;
import com.zs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/7/15.
 */
@RestController
@RequestMapping("/plus")
public class PlusController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("findAll")
    @ResponseBody
    public List<User> queryAll() {
        return userMapper.selectList(new EntityWrapper<User>().eq("name", "www"));
    }

    @RequestMapping("findAll2")
    @ResponseBody
    public List<User> queryAll2() {
        return userMapper.selectList(new EntityWrapper<User>());
    }
}
