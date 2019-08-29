package com.cashsystem.cmd.impl.common;

import com.cashsystem.cmd.annotation.AdminCommand;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.annotation.CustomerCommand;
import com.cashsystem.cmd.annotation.EntranceCommand;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Command;
import com.cashsystem.cmd.impl.Commands;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.entity.Account;

import java.util.*;

import static java.lang.String.join;
import static jdk.nashorn.internal.objects.Global.print;

@CommandMeta(
        name="BZXX",
        desc="帮助信息",
        group="公共命令"

)
@AdminCommand
@CustomerCommand
@EntranceCommand
public class HelpCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        Account account=subject.getAccount();
        if (account==null){
            entranceHelp();
        }
        else{
            switch (account.getAccountType()){
                case CUSTOMER:
                    customerHelp();
                    break;
                case ADMIN:
                    adminHelp();
                    break;
                    default:
            }
        }
    }//Map.values 方法，返回所有value的集合

    public void entranceHelp(){
        print("欢迎使用", Commands.ENTRANCE_COMMANDS.values());
    }
    public void customerHelp(){
        print("用户端", Commands.CUSTOMER_COMMANDS.values());
    }
    public void adminHelp(){
        print("管理端", Commands.ADMIN_COMMANDS.values());
    }
    public void print(String title, Collection<Command>collection){
        System.out.println("************"+title+"*************");
        Map<String,List<String>> helpInfo=new HashMap<>();
        for (Command command:collection){
            CommandMeta commandMeta=command.getClass().getDeclaredAnnotation(CommandMeta.class);
            String group=commandMeta.group();//key
            List<String>func=helpInfo.get(group);
            if (func==null){
                func=new ArrayList<>();
                helpInfo.put(group,func);
            }
            func.add(commandMeta.desc()+"("+commandMeta.name()+")");
        }
        int i=0;
        //Map采用的是Entry内部类来表示一个映射项，映射项包含Key和Value
        //Map.Entry里面包含getKey()和getValue()方法
        //entrySet 键值对的集合
        for (Map.Entry<String,List<String>>entry:helpInfo.entrySet()){
              i++;
            System.out.println(i+"."+entry.getKey());
              int j=0;
        for (String item:entry.getValue()){
              j++;
               System.out.println("\t"+(i)+"."+(j)+" "+item);
        }
        }
        System.out.println("输出菜单括号后的标号，进行下一步操作");
        System.out.println("**********************************");
        System.out.println("**********************************");

    }


}
