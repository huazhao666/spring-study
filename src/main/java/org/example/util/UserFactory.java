package org.example.util;

import org.example.model.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-18
 * Time : 12:12
 */
@Component
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
            User user = new User();
            user.setUsername("姜子牙");
            user.setPassword("9981");
            return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
