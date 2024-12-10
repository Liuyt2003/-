package com.s.lyt.service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.s.lyt.dao.userDao;
import com.s.lyt.pojo.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    userDao userDao;
    public List<users> findAll(){
      return   userDao.selectList(new QueryWrapper<>());
    }
}
