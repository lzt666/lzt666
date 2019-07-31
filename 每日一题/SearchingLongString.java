package javaclass;

import java.util.Scanner;

public class SearchingLongString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        String[] s=str.split("[^0-9]+");
        if (s.length>0&&str.length()>0){
            String max=s[0];
            for (int i=1;i<s.length;i++){
                if (max.length()<s[i].length()){
                    max=s[i];

                }
            }
            System.out.println(max);
        }else {
            System.out.println(0);
        }
    }
}
