package org.example.Service;

import org.example.dao.LoginDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-18
 * Time : 11:01
 */
@Service
@Scope("prototype")
public class LoginService {
    @Autowired
    private LoginDAO loginDAO;
}
