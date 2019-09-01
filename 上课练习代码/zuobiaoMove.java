package javaclass;

import java.util.Scanner;

public class zuobiaoMove {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String str=scanner.nextLine();
            move(str);
        }
    }
    static  void move(String str){
        int x=0;
        int y=0;
        String[]arr=str.split(";");
        for (int i=0;i<arr.length;i++){
            if (arr[i].length()<=3 && arr[i].length()>0){
                if (arr[i].substring(1).matches("[0-9]+")){
                    char ch=arr[i].charAt(0);
                    if (ch=='A'){
                        x=x-(int) Integer.parseInt(arr[i].substring(1));
                    }else if (ch=='D'){
                        x=x+(int)Integer.parseInt(arr[i].substring(i));
                    }else if (ch=='S'){
                        y=y-(int)Integer.parseInt(arr[i].substring(1));
                    }else if (ch=='W'){
                        y=y+(int)Integer.parseInt(arr[i].substring(1));
                    }
                }
            }
        }
        System.out.println(x+","+y);
    }
}
