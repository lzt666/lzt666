package com.cashsystem.service;

import com.cashsystem.dao.GoodsDao;
import com.cashsystem.entity.Account;
import com.cashsystem.entity.Goods;

import java.util.List;

public class GoodsService {
    public GoodsDao goodsDao;
    public GoodsService(){
        this.goodsDao=new GoodsDao();
    }
    public List<Goods>quarryAllGoods(){

        return this.goodsDao.quarryAllGoods();
    }
    public  boolean putAwayGoods(Goods goods){//上架商品方法

        return this.goodsDao.putAwayGoods(goods);
    }
    public Goods getGoods(int goodId){//通过goodsId拿到对应的货物
        return this.goodsDao.getGoods(goodId);
    }

    public  boolean modifyGoods(Goods goods){
        return this.goodsDao.modifyGoods(goods);
    }
    public boolean soldOutGoods(Goods goods){
        return this.goodsDao.soldOutGoods(goods);
    }
    public boolean updateAfterPay(Goods goods,int goodsNum){
        return this.goodsDao.updateAfterPay(goods,goodsNum);
    }

}
