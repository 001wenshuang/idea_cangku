package com.example.Springboot_demo.propretis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.example.Springboot_demo.propretis
 * @date 2019/1/2
 */

@ConfigurationProperties(prefix = "mail") //将整个java bean  当做 配置  传递 对象在Spring 容器中 key 是mail
//通过配置文件 给对象注入值
@Component
public class Gerenxingxi {

    private String xuehao;
    private  String age;
    private  String xueji;

    public Gerenxingxi(final String xuehao, final String age, final String xueji) {
        this.xuehao = xuehao;
        this.age = age;
        this.xueji = xueji;
    }

    public Gerenxingxi() {
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(final String xuehao) {
        this.xuehao = xuehao;
    }

    public String getAge() {
        return age;
    }

    public void setAge(final String age) {
        this.age = age;
    }

    public String getXueji() {
        return xueji;
    }

    public void setXueji(final String xueji) {
        this.xueji = xueji;
    }

    @Override
    public String toString() {
        return "Gerenxingxi{" +
                "xuehao='" + xuehao + '\'' +
                ", age='" + age + '\'' +
                ", xueji='" + xueji + '\'' +
                '}';
    }
}
