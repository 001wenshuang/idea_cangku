package com.example.Springboot_demo.ServiceImpl;

import com.example.Springboot_demo.Service.DutuService;
import com.example.Springboot_demo.mapper.UserMapper;
import com.example.Springboot_demo.pojo.Dutu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.example.Springboot_demo.ServiceImpl
 * @date 2019/1/3
 */

@Service
public class DutuServiceImpl implements DutuService {
    @Autowired
    public UserMapper Mapper;

    @Override
    public Dutu getDutu( String username) {//  alt +inser 添加重写的方法


        Dutu huojin = Mapper.getdutu(username);

        System.out.println(huojin);
        return huojin;
    }
}
