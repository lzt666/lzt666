package com.cashsystem.cmd.impl.account;

import com.cashsystem.cmd.annotation.AdminCommand;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.entity.Account;

import java.util.List;

@CommandMeta(
        name="CKZH",
        desc="查看账户 ",
        group = "账号信息"
)


@AdminCommand
public class AccountBrowseCommand  extends AbstractCommand    {
    @Override
    public void execute(Subject subject) {

        System.out.println("查看我的账户列表");
        List<Account>accountList=this.accountService.queryAllAccount();
        if (accountList.isEmpty()){
            System.out.println("账户信息为空");
        }else {
            for (Account account:accountList){
                System.out.println(account);
            }
        }
    }//启动所有的服务

}
