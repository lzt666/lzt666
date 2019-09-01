package javaclass;

import java.util.Scanner;

public class Pingpang {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();

            int[] arrA = new int[26];
            int[] arrB = new int[26];

            for(int i =0;i<s1.length();i++){
                arrA[s1.charAt(i)-'A']++;
            }
            for(int i =0;i<s2.length();i++){
                arrB[s2.charAt(i)-'A']++;
            }

            boolean flag = true;
            for(int i=0;i<26;i++){
                if(arrA[i]<arrB[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
