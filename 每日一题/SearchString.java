package javaclass;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    }

    public static void getNum(String s) {
        int tempCount,tempStart=0,maxCount=0,maxStart=0;
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            tempCount=0;
            if (isNum(ch[i])){
                tempStart=i;
                tempCount++;
                while ((i<s.length()-1)&&isNum(ch[++i])){
                    tempCount++;
                }
            }
            if (tempCount>maxCount){
                maxCount=tempCount;
                maxStart=tempStart;
            }
        }

        System.out.println(s.substring(maxStart,maxStart+maxCount));

    }

    private static boolean isNum(char ch) {
        if ((ch>='0')&&(ch<='9')){
            return true;

        }
        return false;
    }
}
