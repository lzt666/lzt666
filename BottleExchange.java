package javaclass;

import java.util.Scanner;

public class BottleExchange{

    public static int drink(int n){
        //设最多能换total瓶饮料
        int total = 0;
        //当n>2时才进行喝饮料从、产生空瓶，并将空瓶数和total值累加
        while (n > 2){
            total += n/3;
            n = n/3 + n%3;
        }
        //当空瓶数等于2时，可以向商店借一瓶饮料，total加1
        if (n == 2){
            total++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (scanner.hasNext()){
            n = scanner.nextInt();
            //当输入为0时程序结束
            if (n == 0){
                break;
            }
            System.out.println("能换"+drink(n)+"瓶饮料喝~");
        }
    }
}
