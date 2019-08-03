package javaclass;

import java.util.Scanner;

public class PasswordSelection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.next();
            if (str.length()>8&&result(str)>=3&&isRepeat(str)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }

    public static boolean isRepeat(String str) {
        int[][]dp=new int[str.length()+1][str.length()+1];
        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+1;
                }
            }
        }
        int[]s=new int[str.length()];
        for (int i=0;i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if (str.charAt(i)!=str.charAt(j)){
                    s[dp[i][j]]++;
                }
            }
        }
        for (int i=3;i<s.length;i++){
            if (s[i]>1){
                return false;
            }
        }
        return true;
    }

    public static int   result(String str) {
      int count=0;
      if (str.length()-str.replaceAll("[A-Z]","").length()>0){
          count++;
      }
        if (str.length()-str.replaceAll("[a-z]","").length()>0){
            count++;
        }
        if (str.length()-str.replaceAll("[0-9]","").length()>0){
            count++;
        }
        if (str.replaceAll("[0-9,A-Z,a-z]","").length()>0){
          count++;
        }
        return count;
    }
}
