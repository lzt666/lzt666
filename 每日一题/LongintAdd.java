package javaclass;


import java.util.Scanner;

import java.math.*;

    public class LongintAdd {

        public static void main(String[] args) {
// TODO Auto-generated method stub
            Scanner in=new Scanner(System.in);
            while(in.hasNext()){
                String a=in.next();
                String b=in.next();
                BigInteger sum=new BigInteger(a);
                BigInteger sum1=new BigInteger(b);
                BigInteger res=sum.add(sum1);
                System.out.println(res);
            }

        }

    }

