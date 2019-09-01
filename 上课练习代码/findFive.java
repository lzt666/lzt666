package javaclass;

import java.util.*;
public class findFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
}
/*
public class findFive {//求n阶乘0的个数

    public static void main(String[] args) {
        System.out.println(getthe5times(25));
    }

    private static int getthe5times(int n) {
        int times=0;//5的 次数
        if (n<5)
            return 0;
        for (int i=5;i<=n;i++){
            int num=i;
            while ((num%5==0)&&(num>=5)){
                System.out.println(num);
                num=num/5;
                times++;

            }
        }
        return times;
    }
}
*/
