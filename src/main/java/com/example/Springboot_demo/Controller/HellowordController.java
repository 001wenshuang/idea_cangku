package com.example.Springboot_demo.Controller;

import com.example.Springboot_demo.Service.DutuService;
import com.example.Springboot_demo.pojo.Dutu;
import com.example.Springboot_demo.propretis.Gerenxingxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.example.Springboot_demo.Controller
 * @date 2019/1/2
 */

@Controller
public class HellowordController {

    @Value("${yonglongusername}") //讲配置文件中 Application.xml 的值注入进来
    private String username;
    @Autowired  //把spring 容器中的注入 进来
    private Gerenxingxi  xiaofang;

    @Autowired
    private DutuService dutuServiceImpl;

    @RequestMapping("/hello") //映射网址
    @ResponseBody //返回给页面
    public String showHelloWolrd(){
        return "hello word";
    }

    @RequestMapping("/getusername") //映射网址
    @ResponseBody //返回给页面
    public String getUsername00(){

        return username;
    }


    @RequestMapping("/xiaofang") //映射网址
    @ResponseBody //返回给页面
    public  Gerenxingxi zhanshi(){

System.out.println(xiaofang);
        return xiaofang;
    }



    @RequestMapping("/dutu/{username}") //映射网址
    @ResponseBody //返回给页面
    public Dutu getdct(@PathVariable String username){//使用请求变量获取

        Dutu dutu = dutuServiceImpl.getDutu(username);

        return dutu;
    }



}
