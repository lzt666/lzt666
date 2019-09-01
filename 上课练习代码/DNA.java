package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNA {
    public static void main(String[] args)throws NumberFormatException ,IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bufferedReader.readLine())!=null){
            int maxRadio=0;
            int index=0;
            int n=Integer.parseInt(bufferedReader.readLine());
            for (int i=0;i<=str.length()-n;i++){
                int temp=getmaxRadio(str.substring(i,i+n));
                if (temp>maxRadio){
                    maxRadio=temp;
                    index=i;
                }
            }
            System.out.println(str.substring(index,index+n));
        }
    }

    private static int getmaxRadio(String substring) {
        int count=0;
        for (int i=0;i<substring.length();i++){
            if ('G'==substring.charAt(i)||'C'==substring.charAt(i)){
                count++;
            }
        }
        return count;
    }

}
