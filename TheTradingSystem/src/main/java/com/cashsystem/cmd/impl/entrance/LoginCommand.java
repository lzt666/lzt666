package com.cashsystem.cmd.impl.entrance;

import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.annotation.EntranceCommand;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Command;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.common.AccountStatus;
import com.cashsystem.entity.Account;
@CommandMeta(
        name="DL",
        desc="登录",
        group = "入口命令"

)
@EntranceCommand
public class LoginCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {

        Account account = subject.getAccount();
        if (account != null) {
            System.out.println("您已经登陆过");
        }
        System.out.println("输入用户名：");
        String username = scanner.nextLine();
        System.out.println("输入密码：");
        String password = scanner.nextLine();
        account = this.accountService.login(username, password);
        if (account!=null&&account.getAccountStatus()==AccountStatus.UNLOCK){
            System.out.println(account.getAccountType()+"登录成功");
            subject.setAccount(account);
        }else {
            System.out.println("密码或者用户名错误");
        }
    }
}