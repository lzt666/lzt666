package com.cashsystem.entity;

import com.cashsystem.common.AccountStatus;
import com.cashsystem.common.AccountType;
import lombok.Data;

@Data
public class Account {
    private Integer id;//编号
    private String  username;//用户名
    private String  password;//密码
    private String name;//姓名
    private AccountType accountType;//账户类型：1管理员，2客户
    private AccountStatus accountStatus;//账号状态：1启用 ，2 锁定

}
