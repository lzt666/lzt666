package javaclass;

import java.util.Scanner;

public class BuyApple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []data=new int [101];
        data[0]=1;
        if (n<6){//买的苹果数量少于6个，输出-1；
            System.out.println(-1);
        }
        data[6]=2;
        for (int i=8;i<=n;i++){
            if (data[i-8]!=0){
                data[i]=data[i-8]+1;

            }else if (data[i-6]!=0){
                data[i]=data[i-6]+1;
            }
        }
        if (data[n] == -1){
            System.out.println(-1);
        }else {
            System.out.println(data[n]-1);
        }
    }
}
