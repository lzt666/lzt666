package com.cashsystem.cmd.impl;

import com.cashsystem.entity.Account;

public class Subject {
    private Account account;

    public Account getAccount(){
        return this.account;
    }
    public void setAccount(Account account){
        this.account=account;
    }
}
