package com.example.Springboot_demo.mapper;

import com.example.Springboot_demo.pojo.Dutu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
//@Mapper  //这个注解 是让这个interface 通过spring 扫描 自动创建一个 实现类
//取消上面的注解使用包扫描
public interface UserMapper {
    //sql 语句
    @Select(value = "select * from t1 where username=#{username}")
    public Dutu getdutu(String username);
}
