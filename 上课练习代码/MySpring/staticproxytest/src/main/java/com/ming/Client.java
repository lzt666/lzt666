package com.ming;

public class Client {

    public static void main(String[] args) throws Exception {
//        IUserManager iUserManager  = new StaticProxy(new UserManagerImpl());
//        iUserManager.addUser("arvin","123");
//        iUserManager.modifyUser(1,"arvin","111");
//        iUserManager.delUser(1);

        DynamicProxy dp = new DynamicProxy();
        IUserManager iUserManager = (IUserManager) dp.createDynamicProxyObjectInstance(new UserManagerImpl());
        iUserManager.addUser("arvin","123");
        iUserManager.modifyUser(1,"arvin","111");
        iUserManager.delUser(1);
    }
}
