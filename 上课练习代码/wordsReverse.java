package javaclass;

import java.util.Scanner;

public class wordsReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str  =scanner.nextLine();
            int len=str.length();
            String[]s=str.split(" ");
            StringBuilder stringBuilder=new StringBuilder();
            for (int i=s.length-1;i>=0;i--){
                stringBuilder.append(s[i]+" ");
            }
            System.out.println(stringBuilder.substring(0,len));
        }
    }
}
