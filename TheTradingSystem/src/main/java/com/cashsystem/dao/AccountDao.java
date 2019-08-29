package com.cashsystem.dao;

import com.cashsystem.common.AccountStatus;
import com.cashsystem.common.AccountType;
import com.cashsystem.entity.Account;
import com.cashsystem.entity.Goods;
import org.apache.commons.codec.digest.DigestUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDao extends BaseDao{
    public Account login(String username,String password){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Account account=null;
        try {//拿到连接
            connection=this.getConnection(true);
            String sql="select id,username,password,name,account_type,account_status from account where username=?  and password=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,DigestUtils.md5Hex(password));//注册密码加密

            resultSet=preparedStatement.executeQuery();
            //返回结果集合到resultset
            if (resultSet.next()){
                //解析resultset，拿到对应的account
                account =this.extractAccount(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;

    }
    public boolean register(Account account) {//注册函数
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean effect = false;
        try {//拿到连接
            connection = this.getConnection(true);
            String sql = "insert into account(username,password,name,account_type,account_status )values(?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, DigestUtils.md5Hex(account.getPassword()));//记录第一次密码加密
            preparedStatement.setString(3, account.getName());
            preparedStatement.setInt(4, account.getAccountType().getFlg());//类型
            preparedStatement.setInt(5, account.getAccountStatus().getFlg());//状态
            effect = (preparedStatement.executeUpdate() == 1);
            resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                Integer id = resultSet.getInt(1);
                account.setId(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.closeResource(resultSet,preparedStatement,connection);
        }
        return effect;
    }
    private Account extractAccount(ResultSet resultSet) throws SQLException {
        Account account=new Account();
        account.setId(resultSet.getInt("id"));
        account.setUsername(resultSet.getString("username"));
        account.setPassword(resultSet.getString("password"));
        account.setName(resultSet.getString("name"));
        account.setAccountType(AccountType.valueOf(resultSet.getInt("account_type")));
        account.setAccountStatus(AccountStatus.valueOf(resultSet.getInt("account_status")));
        return account;
    }
    public List<Account> queryAllAccount(){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        List<Account>list=new ArrayList<>();
        try{
            connection=this.getConnection(true);
            String sql="select * from account";
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Account account=this.extractAccount(resultSet);
                if (account!=null){
                    list.add(account);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public Account getAccount(int accountId){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        Account account=null;
        try{
            connection=this.getConnection(true);
            String sql="select * from account where id=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,accountId);
            resultSet=preparedStatement.executeQuery();
            if (resultSet.next()){
                account=this.extractAccount(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    public boolean updatePassword(String password,int accountId){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        boolean effect=false;
        try{
            connection=this.getConnection(true);
            String sql="update account set password =?where id=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,DigestUtils.md5Hex(password));
            preparedStatement.setInt(2,accountId);
             effect=preparedStatement.executeUpdate() ==1;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return effect;
    }


}
