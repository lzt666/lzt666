package javaclass;

import java.util.Scanner;

public class Jinzhizhuanhuan {
    //进制转换，16进制转换为10进制
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String in=scanner.nextLine();
            fun(in);
        }
    }
    public static  void fun(String in){
        String subString =in.substring(2,in.length());
        int result=0;
        for (int i=0;i<subString.length();i++){
            if (subString.charAt(i) >= 'A' && subString.charAt(i) <= 'F') {

                result+=result*15+subString.charAt(i)-'A'+10;

            }else  if(subString.charAt(i)>='a'&&subString.charAt(i)<='f'){
                result+=result*15+subString.charAt(i)-'a'+10;
            }else {
                result+=result*15+subString.charAt(i)-'0';
            }
        }
        System.out.println(result);
    }
}
