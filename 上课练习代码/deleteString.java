package javaclass;

import java.util.Scanner;

public class deleteString {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();
            String replace="["+str2+"]";
            String result=str1.replaceAll(replace,"");
            System.out.println(result);
        }
    }
}
