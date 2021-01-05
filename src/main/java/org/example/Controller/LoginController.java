package org.example.Controller;

import org.example.Service.LoginService;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-18
 * Time : 10:59
 */
@Controller
public class LoginController {
    //resource是JDK提供的注解，Spring的DI提供了该注解的实现；
    @Resource
    private LoginService loginService;
    //spring提供的注解，只能在spring框架中使用：
    @Autowired
    @Qualifier("user1")
    public User user;


}
