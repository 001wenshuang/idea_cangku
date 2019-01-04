package com.example.Springboot_demo;

import com.example.Springboot_demo.mapper.UserMapper;
import com.example.Springboot_demo.pojo.Dutu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

	@Autowired
	public UserMapper  Mapper;
	@Test
	public void contextLoads() {

		Dutu huojin = Mapper.getdutu("huojin");

		System.out.println(huojin);


	}

}

