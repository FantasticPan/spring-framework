package com.pan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by FantasticPan on 2019/2/17.
 */
@Component
public class LoginImpl implements ILogin {

    String id = "";

    @Autowired(required = false)
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String loginCheck(String userName, String password) {
        System.out.println("boy登录...");
        return "success";
    }
}
