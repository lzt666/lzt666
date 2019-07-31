package javaclass;

import java.util.LinkedList;
import java.util.Scanner;

public class BuySomethingOrNot {//到底买不买，珠子问题

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.next();
            String str2=scanner.next();
            LinkedList<Character>list=new LinkedList<Character>();
            for (int i=0;i<str1.length();i++){
                char ch=str1.charAt(i);
                list.add(ch) ;
            }
            int count=0;
            for (int i=0;i<str2.length();i++){
                char ch=str2.charAt(i);
                for (int j=0;j<list.size();j++){
                    if (ch==list.get(j)){
                        list.remove(j);
                        count++;
                        break;
                    }
                }
            }
            if (count==str2.length())
                System.out.println("Yes "+(str1.length()-count));
            else
                System.out.println("No "+(str2.length()-count));
    }
    scanner.close();
    }
}
