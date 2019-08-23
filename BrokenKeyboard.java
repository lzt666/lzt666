package javaclass;

import java.util.Scanner;

public class BrokenKeyboard {
    //破碎的键盘
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String pre=scanner.next();
        String pro=scanner.next();
        pre=pre.toUpperCase();
        pro=pro.toUpperCase();
        for (int i=0;i<pro.length();i++){
            pre=pre.replace(pro.charAt(i)+"","");
        }
        String countStr="";
        for (int i=0;i<pre.length();i++){
            if (countStr.contains(pre.charAt(i)+"")){
                continue;
            }else {
                System.out.print(pre.charAt(i));
                countStr+=pre.charAt(i);
            }
        }
        System.out.println();
    }
}
