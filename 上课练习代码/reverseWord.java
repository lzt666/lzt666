package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class reverseWord {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String result=bufferedReader.readLine();
        String[]word=result.split(" ");
        StringBuffer stringBuffer=new StringBuffer(" ");
        for (int i=word.length-1;i>=0;i--){
            stringBuffer.append(word[i]);
            stringBuffer.append(" ");
        }
        System.out.println(stringBuffer.toString().substring(0,stringBuffer.length()-1));

    }
}
