package javaclass;

import java.util.Scanner;

public class ShuziFenlei {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []number=new int[n];
        for (int i=0;i<n;i++){
            number[i]=scanner.nextInt();
        }
        System.out.println(a1(number)+" "+a2(number)+" "+a3(number)+" "+a4(number)+" "+a5(number));
    }

    public static String a5(int[] number) {
        int maxNumber=0;
        for (int i=0;i<number.length;i++) {
            if (number[i] % 5 == 4 && number[i] > maxNumber)
                maxNumber = number[i];
        }
            if (maxNumber == 0)
                return "N";
            else
                return String.valueOf(maxNumber);

    }

    public static String a4(int[] number) {
        double sum=0;
        int x=0;
        for (int i=0;i<number.length;i++){
            if (number[i]%5==3){
                sum+=number[i];
                x++;
            }
        }
        if (sum==0)return "N";
        else {
            String result = String.format("%.1f", sum / x);
            return result;
        }
    }

    public static String a3(int[] number) {
        int sum=0;
        for (int i=0;i<number.length;i++){
            if (number[i]%5==2)
                sum++;
            }
            if (sum==0)
                return "N";
            else
                return String.valueOf(sum);

    }

    public static String a2(int[] number) {
        int flag=1;
        int sum=0;
        for (int i=0;i<number.length;i++){
            if (number[i]%5==1){
                if (flag>0){
                    sum+=number[i];
                    flag=-flag;
                }
                else{
                    sum-=number[i];
                    flag=-flag;
                }
            }
        }
        if (sum==0)
            return "N";
        else
        return String.valueOf(sum);
    }

    public static String a1(int[] number) {
        int sum=0;
        for (int i=0;i<number.length;i++){
            if (number[i]%10==0)
                sum+=number[i];
        }
        if (sum==0)
        return "N";
        else
            return String.valueOf(sum);
    }

}
