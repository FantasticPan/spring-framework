package com.pan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by FantasticPan on 2019/2/17.
 */
public class App {

    public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
//        String XMLPath = "classpath:spring.xml";
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
        ILogin login = (ILogin) applicationContext.getBean("loginService");
        login.loginCheck("boy", "123");
    }
}
