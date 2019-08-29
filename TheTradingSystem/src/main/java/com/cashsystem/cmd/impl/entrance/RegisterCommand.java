package com.cashsystem.cmd.impl.entrance;

import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.annotation.EntranceCommand;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Command;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.common.AccountStatus;
import com.cashsystem.common.AccountType;
import com.cashsystem.entity.Account;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@CommandMeta(
        name="ZC",
        desc="注册",
        group = "入口命令"

)
@EntranceCommand
public class RegisterCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        System.out.println("请输入用户名：");
        String username=scanner.nextLine();
        System.out.println("请输入密码：");
        String password1= scanner.nextLine();
        System.out.println("请再次输入密码：");
        String password2= scanner.nextLine();
        if (!password1.equals(password2)){
            System.out.println("两次输入密码不一致！");
            return;
        }
        System.out.println("请输入姓名：");
        String name= scanner.nextLine();
        System.out.println("请输入账户的类型： 1.管理员 2.用户");
        int accountType=scanner.nextInt();
        AccountType accountType1=AccountType.valueOf(accountType);
        System.out.println("请输入用户的状态：1.启用 2.启停");
        int accountStatus1=scanner.nextInt();
        AccountStatus accountStatus=AccountStatus.valueOf(accountStatus1);
        final Account account=new Account();
        account.setUsername(username);
        account.setPassword(password1);
        account.setName(name);
        account.setAccountStatus(accountStatus);
        account.setAccountType(accountType1);
        boolean effect=this.accountService.Register(account);
        if (effect ) {
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
    }

    }
        /*Account account = subject.getAccount();
        if (account == null) {
            System.out.println("****请注册新账户****");
        }
        System.out.println("输入用户名：");
        String username = scanner.nextLine();
        System.out.println("输入密码：");
        String password = scanner.nextLine();
        System.out.println("请再次输入密码");
        String password1 = scanner.nextLine();
        System.out.println("请输入用户类型：");
        Integer account_type = scanner.nextInt();
        if (password == password1) {
            System.out.println("注册成功");

        } else if (account != null && account.getAccountStatus() == AccountStatus.UNLOCK) {
            account = this.accountService.Register(username, password);

            System.out.println(account.getAccountType() + "请重新输入");
            subject.setAccount(account);
        }*/


        /*BufferedWriter bw=null;//初始化输出流
        //用户信息不能为空
        if (account!=null){
            try{
                //实例化输出流
                bw=new BufferedWriter(new FileWriter(file,true));
                //写入数据
                bw.write(account.getName()+"=>"+account.getPassword());
                //创建新行
                bw.newLine();
                //刷新数据
                bw.flush();
            } catch (IOException e) {
                System.out.println("注册失败"+e.getMessage());
            }finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("关闭BufferedWriter输出流异常："+e.getMessage());
                }
            }
        }else {
            //注册信息失败
            System.out.println("注册失败用户信息不能为空");
        }*/
