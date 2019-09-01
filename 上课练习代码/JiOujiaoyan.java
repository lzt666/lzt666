package javaclass;

import java.util.Scanner;

public class JiOujiaoyan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            for (int i=0;i<str.length();i++){
                int ch=str.charAt(i);
                if (oneNumber(ch)%2==0){
                    ch+=128;
                }
                System.out.println(num(ch));
            }
        }
    }

    private static String num(int ch) {
        int n=128;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<8;i++){
            if ((n&ch)==n) {
                sb.append("1");
            }
            else {
                sb.append("0");
            }
            n=(n>>>1);
        }
        return sb.toString();

    }

    private static int  oneNumber(int ch) {//判断进制转换后二进制的1的个数
        int count=0;
        int n=1;
        for (int i=0;i<8;i++){
            if((ch&n)==n){
                count++;
            }
            n=(n<<1);
        }
        return count;
    }
}
