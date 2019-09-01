package javaclass;

import java.util.Scanner;

public class FindLongstringFromString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str= sc.nextLine();
            String[] strs = str.split("[^0-9]");
            int max = 0;
            for(int i = 0;i<strs.length;i++){
                if(max<strs[i].length())
                    max = strs[i].length();
            }
            String result = "";
            for(int i =0;i<strs.length;i++){
                if(strs[i].length()==max)
                    result+=strs[i];
            }
            System.out.println(result+","+max);
        }
    }
}
