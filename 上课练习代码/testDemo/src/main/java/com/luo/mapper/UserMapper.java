package com.luo.mapper;

import com.luo.bz.UserBz;
import com.luo.po.UserEx;


import java.util.List;

public interface UserMapper {
    public List<UserEx> queryUserZH(UserBz userBz)throws Exception;
    public int queryUserCount(UserBz userBz)throws Exception;
    public List<UserEx>queryUserByMoreIds(UserBz userBz)throws Exception;
}
