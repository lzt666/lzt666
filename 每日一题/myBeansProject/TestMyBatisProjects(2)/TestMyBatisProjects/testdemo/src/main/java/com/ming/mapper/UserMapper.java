package com.ming.mapper;

import com.ming.bz.UserBz;
import com.ming.po.User;
import com.ming.po.UserEx;

import java.util.List;

public interface UserMapper {

    public List<UserEx> queryUserZH (UserBz userBz) throws Exception;
    public int queryUserCount (UserBz userBz) throws Exception;
    public List<UserEx> queryUserByMoreIds(UserBz userBz) throws Exception;
    public List<User> queryUserByAlias() throws Exception;
    public List<User> queryUserByAlias2() throws Exception;
}
