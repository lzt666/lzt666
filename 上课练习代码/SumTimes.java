package javaclass;

import java.util.Scanner;

public class SumTimes {//求数字和为sum的方法数

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=scanner.nextInt();
        int []times=new int[n];
        long[]result=new long[sum+1];
        result[0]=1;
        for (int i=0;i<n;i++){
            times[i]=scanner.nextInt();
            for (int j=sum;j>=0;j--){
                if (j>=times[i]){
                    result[j]+=result[j-times[i]];
                }
            }
        }
        System.out.println(result[sum]);
    }
}
