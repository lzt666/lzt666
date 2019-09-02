package com.ming.model;

import com.ming.dao.UserInfoDAO;
import com.ming.vo.UserInfo;

public class UserInfoServiceImpl implements IUserInfoService {

    private UserInfoDAO userInfoDAO = new UserInfoDAO();

    public int checkUserInfoService(UserInfo userInfo) {
        return userInfoDAO.checkUserInfo(userInfo);
    }
}
