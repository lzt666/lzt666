package javaclass;

import java.util.Scanner;

public class SickleAndGalleon {//找零钱，进制是1加隆兑换17个西可，1个西可兑换29个纳特
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String [] str1=scanner.next().split("\\.");
        String [] str2=scanner.next().split("\\.");
        scanner.close();
        int P=Integer.parseInt(str1[0])*17*29+Integer.parseInt(str1[1])*29+Integer.parseInt(str1[2]);
        int A=Integer.parseInt(str2[0])*17*29+Integer.parseInt(str2[1])*29+Integer.parseInt(str2[2]);
        int result=A-P;
        int G=result/(17*29);
        int S=Math.abs(result%(17*29)/29);
        int K=Math.abs(result%(17*29)%29);
        System.out.println(G+"."+S+"."+K);
    }
}
