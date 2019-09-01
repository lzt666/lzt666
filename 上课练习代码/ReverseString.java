package javaclass;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println(getAns(str.toCharArray(), 0, str.length() - 1, false) ? "YES" : "NO");
        }
    }
    private static boolean getAns(char[]a,int start,int end,boolean flag){
        if (end<=start){
            return  true;
        }
        if (a[start]==a[end]){
            return getAns(a,start+1,end-1,flag);
        }
        else {
            if (flag){
                return false;
            }
            return getAns(a,start,end-1,true)||getAns(a,start+1,end,true);
        }
    }
}
