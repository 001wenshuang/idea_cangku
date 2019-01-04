package com.example.Springboot_demo.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.example.Springboot_demo.springsecurity
 * @date 2019/1/3
 */

@EnableWebSecurity  //开启 security 验证
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder createPasswordEncoder(){// 访问这个类的时候
        return new BCryptPasswordEncoder();//创建 一个加密对象
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        (
                (HttpSecurity)
                        (
                                (HttpSecurity)
                                        ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)
                                                http.authorizeRequests()//授权请求
                                                        .anyRequest()//所有的请求
                                        )
                                                .authenticated()//必须要认证过后  才能 进行访问
                                                .and() //并且
                        )
//                        .formLogin() //是通过 表单方式
//                        .and()
        )
//                .httpBasic();//security 默认的方式  弹框方式
                .formLogin();//表达提交方式



    }

}
