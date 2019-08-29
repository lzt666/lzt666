package com.cashsystem.cmd;

import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Command;
import com.cashsystem.cmd.impl.Commands;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.entity.Account;
import java.util.Scanner;
import static com.cashsystem.common.AccountType.ADMIN;
import static com.cashsystem.common.AccountType.CUSTOMER;

public class CheckStand extends AbstractCommand {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new CheckStand().execute(subject);
    }

    @Override
    public void execute(Subject subject) {
        Commands.getCacheHelpCommands().execute(subject);
        while (true){
            System.out.println(">>>");

            String line=scanner.nextLine();
            String commandCode=line.trim().toUpperCase();
            Account account=subject.getAccount();
            if (account==null){
                Commands.getEntranceCommand(commandCode).execute(subject);
            }else{
                switch (account.getAccountType()){
                    case ADMIN:
                        Commands.getAdminCommand(commandCode).execute(subject);
                        break;

                    case CUSTOMER:
                        Commands.getCustomerCommand(commandCode).execute(subject);
                        break;
                        default:
                }
            }
        }
    }
}
