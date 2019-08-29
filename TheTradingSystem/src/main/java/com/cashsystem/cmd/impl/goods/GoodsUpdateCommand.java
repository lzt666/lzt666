package com.cashsystem.cmd.impl.goods;

import com.cashsystem.cmd.annotation.AdminCommand;
import com.cashsystem.cmd.annotation.CommandMeta;
import com.cashsystem.cmd.impl.AbstractCommand;
import com.cashsystem.cmd.impl.Command;
import com.cashsystem.cmd.impl.Subject;
import com.cashsystem.entity.Goods;

@CommandMeta(
        name="GXSP",
        desc="更新商品",
        group ="商品信息"

)
@AdminCommand
public class GoodsUpdateCommand extends AbstractCommand {
    @Override
    public void execute(Subject subject) {
        System.out.println("更新商品");
        System.out.println("请输入需要更新的商品编号：");
        int goodsId=scanner.nextInt();
        Goods goods= this.goodsService.getGoods(goodsId);
        if (goods==null){
           printlnInfo("没有此编号的货物");
            return;
        }else {
            printlnInfo("商品信息如下：");
            System.out.println(goods);
        }
        System.out.println("请输入需要更新的商品简介：");
        printlnInfo("请输入商品名称：");
        String name=scanner.next();
        printlnInfo("商品简介：");
        String introduce=scanner.next();
        printlnInfo("商品库存：");
        Integer stock=scanner.nextInt();
        printlnInfo("商品单位：");
        String unit=scanner.next();
        printlnInfo("请输入商品价格：单位：元");
        int price=new Double(100*scanner.nextDouble()).intValue();
        printlnInfo("请输入是商品折扣：75表示75折");
        int discount=scanner.nextInt();
        printlnInfo("请确认是否更新：y/n");
        String flg=scanner.next();
        if ("y".equalsIgnoreCase(flg)){
            //更新数据库表goods
            goods.setIntroduce(introduce);
            goods.setStock(stock);
            goods.setPrice(price);
            goods.setUnit(unit);
            goods.setDiscount(discount);
            //更新数据库
           boolean effect= this.goodsService.modifyGoods(goods);
           if (effect){
               System.out.println("商品更新成功");
           }else {
               System.out.println("商品更新失败");
           }
        }else {
           printlnInfo("您选择不更新!!");
        }
    }
}
