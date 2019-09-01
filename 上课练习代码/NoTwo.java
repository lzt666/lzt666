package javaclass;

import java.util.Scanner;

public class NoTwo {
    public static void main(String[] args) {
        send();

    }

    private static void send() {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int res=getRes(row,col);
        System.out.println(res);
    }

    private static int getRes(int row, int col) {
        int count=0;
        if(row%4==0||col%4==0){
            count=row*col/2;
        }else {
            count=row*col/2+1;

        }
        return count;
    }
}
