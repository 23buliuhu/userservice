package com.zs.controller;

import com.zs.domain.User;
import com.zs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/7/15.
 */
@RestController
@RequestMapping("/user")
public class JpaController {
    @Autowired
    private UserRepository userRepository;


    @RequestMapping("findAll")
    @ResponseBody
    public List<User> queryAll() {
        return userRepository.findAll();
    }

    @PostMapping
    @ResponseBody
    public User saveUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
//        userRepository.delete(id);
    }
}
