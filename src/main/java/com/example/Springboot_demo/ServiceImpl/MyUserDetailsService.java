package com.example.Springboot_demo.ServiceImpl;


import com.example.Springboot_demo.mapper.UserMapper;
import com.example.Springboot_demo.pojo.Dutu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


/**
 * @author wilsonwen 文爽
 * @version 1.0
 * @description com.example.Springboot_demo.Service
 * @date 2019/1/3
 */

@Component  //表示使用自己定义的  密令
public class MyUserDetailsService  implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserMapper Mapper;

    @Override
    public UserDetails loadUserByUsername( String username) throws UsernameNotFoundException {
        //会把 页面中的 用户名 密码 传递到后台 然后跟数据库的传递过来的密码进行匹配

        //从数据库中获取到用户的信息

        Dutu getdutu = Mapper.getdutu(username);
        System.out.println(getdutu);


        if (getdutu==null){

            return null;
        }

        //进行加密；注意此处不应该这么写，此处的方法应当在用户注册的时候调用此方法进行加密处理，验证身份时直接获取数据库中加过密的信息即可

        String encode = passwordEncoder.encode(getdutu.getMima());//从数据库中 获取到 密码 加密  注册的时候 密码 会用这个方法进行加密

        System.out.println(encode);
        //页面中输入额密码
        //然后数据库中加密的密码  进行解密 然后 与页面的密码匹配


        //=======================================================
//        return new User(username,//传递过来的用户名
//                encode,//密码 要数据库获取
//                AuthorityUtils.commaSeparatedStringToAuthorityList("admin")//拥有的权限 不同的权限使用逗号分隔
//        );
//============================================================================


        //============================================================================
        //校验用户是否已经被冻结  用户已经被冻结
        boolean flagNonlock = false;//已经被冻结

        return new User(username,encode,true,true,true,flagNonlock, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//============================================================================

    }
}
