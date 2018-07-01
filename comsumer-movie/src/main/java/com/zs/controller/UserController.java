package com.zs.controller;

import com.zs.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        log.debug("url is {}", userServiceUrl);
//        return restTemplate.getForObject(userServiceUrl + id, User.class);
        String url="http://microservice-provider-user/";
        return restTemplate.getForObject(url + id, User.class);
    }

}