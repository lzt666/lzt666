package javaclass;
//大整数排序

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigIntegerNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            BigInteger[]bg=new BigInteger[n];
            for (int i=0;i<n;i++)
                bg[i]=scanner.nextBigInteger();
                Arrays.sort(bg);
                for (int j = 0; j < n; j++)
                    System.out.println(bg[j]);


        }
    }
}
