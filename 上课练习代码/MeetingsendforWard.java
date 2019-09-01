package javaclass;

import java.util.Scanner;

public class MeetingsendforWard {//年会抽奖
    //利用错排公式进行排列组合
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            float result=(count(n)/possible(n))*100;
            System.out.println(String.format("%.2f",result)+"%");
        }
    }

    public static float possible(int n) {
        if (n==0){
            return 1;
        }else {
            return n*possible(n-1);
        }
    }

    public static float count(int n) {
        if (n==1){
            return 0;
        }if (n==2){
            return 1;
        }else {
            return (n-1)*(count(n-1)+count(n-2));
        }
    }
}
