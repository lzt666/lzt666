package javaclass;

import java.util.Arrays;
import java.util.Scanner;

public class ZiMuTongJi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        int []times=new int [26];
        while(scanner.hasNextLine()){
            Arrays.fill(times,0);
            String str=scanner.nextLine();
            for (int i=0;i<str.length();i++)
                if (Character.isUpperCase(str.charAt(i)))
                times[str.charAt(i) - 'A']++;

            for (int i=0;i<26;i++)
                System.out.println((char)(i+'A')+":"+times[i]);
        }
        scanner.close();
    }
}
