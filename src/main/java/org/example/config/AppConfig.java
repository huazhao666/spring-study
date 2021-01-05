package org.example.config;

import org.example.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-18
 * Time : 11:58
 */
@Configuration
public class AppConfig {
    @Bean
    public User user1(){
        User user = new User();
        user.setUsername("哪吒");
        user.setPassword("123456");
        return user;
    }
    @Bean
    public User user2(){
        User user = new User();
        user.setUsername("二郎神");
        user.setPassword("2346");
        return user;
    }

}
