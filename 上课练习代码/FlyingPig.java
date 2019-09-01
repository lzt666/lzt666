package javaclass;

public class FlyingPig {//风口之下，猪都能飞。当今中国股市牛市，真可谓“错过等七年”。 //
    // 给你一个回顾历史的机会，已知一支股票连续n天的价格走势，以长度为n的整数数组表示，//
    // 数组中第i个元素（prices[i]）代表该股票第i天的股价。 假设你一开始没有股票，//
    // 但有至多两次买入1股而后卖出1股的机会，并且买入前一定要先保证手上没有股票。
    // 若两次交易机会都放弃，收益为0。 设计算法，计算你能获得的最大收益。 输入数值范围：
    // 2<=n<=100,0<=prices[i]<=100


    public int calculateMax(int[] prices) {
        int firstBuy = Integer.MAX_VALUE;
        int firstSell = 0;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = 0;
        for (int curPrice : prices)//第一次买的价格越便宜越好
        {
            firstBuy = Math.min(firstBuy, curPrice);
            firstSell = Math.max(firstSell, curPrice - firstBuy);
            secondBuy = Math.max(secondBuy, firstSell - curPrice);
            secondSell = Math.max(secondSell, secondBuy + curPrice);
        }
        return secondSell;
    }
}