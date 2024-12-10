package com.s.lyt.contoller;

import com.s.lyt.pojo.users;
import com.s.lyt.service.userService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class userController {
    @Autowired
    userService userservice;

    @RequestMapping(value="/find")
    public List<users> findAll(@Param("name") String name, @Param("password") String password){
        System.out.println("username"+" "+name);
        System.out.println("password"+" "+password);

    return userservice.findAll();
    }
}
