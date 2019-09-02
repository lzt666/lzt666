package com.ming;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-beans.xml");
        IUserManager iUserManager  = (IUserManager) context.getBean("userManagerImpl");
        iUserManager.addUser("arvin","123");
        iUserManager.delUser(1);
        iUserManager.modifyUser(1,"aaa","444");
        iUserManager.queryUser(2);
    }
}
