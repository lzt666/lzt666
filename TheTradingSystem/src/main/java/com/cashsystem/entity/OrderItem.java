package com.cashsystem.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Integer id;//订单条目标号
    private String orderId;//订单标号
    private Integer goodsId;//商品标号
    private String goodsName;//商品名称
    private String goodsIntroduce;//商品简介
    private Integer goodsNum;//商品数量
    private String goodsUnit;//商品数量单位 个
    private Integer goodsPrice;//商品价格 元
    private Integer goodsDiscount;//商品折扣
}
