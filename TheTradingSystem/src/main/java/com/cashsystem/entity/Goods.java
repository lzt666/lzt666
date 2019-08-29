package com.cashsystem.entity;

import lombok.Data;

@Data
public class Goods {
    private Integer id;//商品编号
    private String name;//商品名称
    private  String introduce;//商品简介
    private Integer stock;///商品库存
    private String unit;//库存单位
    private Integer price;//商品价格，单位元
    private Integer discount;//商品折扣[0,100]
    private Integer buyGoodsNum;
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("【商品信息】:").append("\n")
                .append("【商品编号】").append(this.getId()).append("\n")
                .append("【商品名称】").append(this.getName()).append("\n")
                .append("【商品简介】").append(this.getIntroduce()).append("\n")
                .append("【商品单位】").append(this.getUnit()).append("\n")
                .append("【商品库存】").append(this.getStock()).append("\n")
                .append("【商品价格】") .append(String.format("%.2f", 1.00D * this.getPrice() / 100)).append(" (元) ").append("\n")
                .append("【商品折扣】").append(this.getDiscount()).append("折").append("\n");
        sb.append("======================================================");
        return sb.toString();
    }

}
