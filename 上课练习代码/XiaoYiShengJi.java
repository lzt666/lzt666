package javaclass;

import java.util.Scanner;

public class XiaoYiShengJi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int num=scanner.nextInt();
            int a=scanner.nextInt();
            int[] N=new int[num];
            for (int i=0;i<N.length;i++){
                N[i]=scanner.nextInt();
            }
            for (int i=0;i<N.length;i++){
                if (a>=N[i]){
                    a+=N[i];
                }else{
                    a+=gcd(N[i],a);
                }
            }
            System.out.println(a);
        }
    }

    public static int gcd(int i, int j) {
        while (i%j!=0){
            int temp=i%j;
            i=j;
            j=temp;
        }
        return j;
    }
}
