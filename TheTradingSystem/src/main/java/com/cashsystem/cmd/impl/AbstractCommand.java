package com.cashsystem.cmd.impl;

import com.cashsystem.service.AccountService;
import com.cashsystem.service.GoodsService;
import com.cashsystem.service.OrderService;

public  abstract class AbstractCommand implements Command{//启动所有的服务
public AccountService accountService;
public GoodsService goodsService;
public OrderService orderService;

public AbstractCommand(){
    this.accountService=new AccountService();
    this.goodsService=new GoodsService();
    this.orderService=new OrderService();
}
public void printlnInfo(String info){
    System.out.println(info);
}
public void warningPrintLn(String warn){
    System.out.println(warn);
}
public  void hitPrintLn(String hit){
    System.out.println(hit);
}
public  void errorPrintLn(String error){
    System.out.println(error);
}
}
