package com.cashsystem.service;

import com.cashsystem.dao.AccountDao;
import com.cashsystem.entity.Account;

import java.util.List;

public class AccountService {
    private AccountDao accountDao;
    public AccountService(){
        this.accountDao=new AccountDao();
    }
    public Account login(String username, String password){
        return this.accountDao.login(username,password);
    }
    public boolean Register(Account account){
        return this.accountDao.register(account);
    }
    public List<Account>queryAllAccount(){
        return this.accountDao.queryAllAccount();
    }
    public Account getAccount(int accountId){
        return this.accountDao.getAccount(accountId);
    }
    public boolean updatePassword(String password,int accountId){
        return this.accountDao.updatePassword(password,accountId);
    }
}
