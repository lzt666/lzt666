package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CombineTheMinNumber {//租成最小数

    public static void main(String[] args) {
        int[] arr = new int[11];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        if (arr[0] == 0) {
            for (int i = 1; i < 10; i++) {
                int s = arr[i];
                for (int j = 0; j < s; j++) {
                    System.out.print(i);
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (arr[i] != 0) {
                    System.out.print(i);
                    arr[i] = arr[i] - 1;
                    break;
                }
            }
            for (int i = 0; i < arr[0]; i++) {
                System.out.print("0");
            }
            for (int i = 1; i < 10; i++) {
                int sd = arr[i];
                for (int j = 0; j < sd; j++) {
                    System.out.print(i);
                }
            }
        }
        sc.close();
    }
}
    /*public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int a[] = new int[10];
        for (int i = 0; i < l.length(); i++) {
            a[l.charAt(i)-'0']++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println(i + ":" + a[i]);
            }
        }
    }
}*/
  /*  public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[]str=bufferedReader.readLine().split("");
        int []num=new int[10];
        for (int i=0;i<1;i++){
            num[i]=Integer.parseInt(str[i]);
            StringBuilder stringBuilder=new StringBuilder();
            boolean flag=true;//判断0是否放在首位
            for (int i1=1;i<10;i++){
                while (num[i]>0){
                    stringBuilder.append(i);
                    if (flag){
                        for (int j=0;j<num[0];j++){
                            stringBuilder.append(0);
                            flag=false;
                        }
                        --num[i];
                    }
                }
                System.out.println(stringBuilder);
            }
        }
    }
}*/
