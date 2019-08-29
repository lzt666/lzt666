package com.cashsystem.cmd.impl.account;

import com.cashsystem.cmd.annotation.AdminCommand;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.entity.Account;


@CommandMeta(
        name="CZMM",
        desc="重置密码",
        group = "账号信息"
)
@AdminCommand

public class AccountPasswordCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        System.out.println("选择需要更新密码的账户");
        System.out.println("输入需要更新的账户ID");
        int accountId=scanner.nextInt();
        Account account=this.accountService.getAccount(accountId);
        if (account==null){
            System.out.println("账户列表为空");
            return;
        }else{
            System.out.println("账户信息如下");
            System.out.println(account);
        }
        System.out.println("输入需要更新的账户初始密码：");
        String password=scanner.next();
        System.out.println("输入需要更新的账户新密码：");
        String password1=scanner.next();
        if (!(password.equals(password1))){
            account.setPassword(password1);
            this.accountService.updatePassword(password1,accountId);

            System.out.println("更新成功！！");
            System.out.println("账户信息\n"+account);
        }else
            {
            System.out.println("输入的密码有误，无法进行修改");
        }
    }
}
