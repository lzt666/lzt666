package com.ming;

public interface IUserManager {

    public boolean addUser(String username,String password) throws Exception;

    public boolean delUser(int id) throws Exception;

    public boolean modifyUser(int id,String username,String password) throws Exception;

    public void queryUser(int id) throws Exception;
}
