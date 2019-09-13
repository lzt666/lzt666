package com.ming.bz;

import com.ming.po.Orders;
import com.ming.po.UserEx;

import java.util.List;

public class UserBz {

    private List<Integer> moreIds;

    private UserEx userEx;

    public UserEx getUserEx() {
        return userEx;
    }

    public void setUserEx(UserEx userEx) {
        this.userEx = userEx;
    }

    public List<Integer> getMoreIds() {
        return moreIds;
    }

    public void setMoreIds(List<Integer> moreIds) {
        this.moreIds = moreIds;
    }
}
