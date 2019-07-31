package javaclass;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int a=0,b=1;
        while (b<=N){
            int b_temp=b+a;
            a=b;
            b=b_temp;
        }
        System.out.print((b-N)>(N-a)?N-a:b-N);
    }
}
