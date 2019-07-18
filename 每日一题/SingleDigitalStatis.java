package javaclass;

import java.util.Scanner;

public class SingleDigitalStatis {//个位数统计

    public static void main(String[] args) {
        int N=0;
        Scanner scanner=new Scanner(System.in);//键盘输入
        N=scanner.nextInt();
        System.out.println("N="+N);//输出正整数N
        int n=N;
        int k=0;
        while (n>0){
            n=n/10;
            k++;
        }
        int n1=N;
        int[] array=new int[1000];
        for (int i=0;i<k;i++){
            if (i==k-1);{
                array[k-1]=(int)(n1/(Math.pow(10,(k-1))));
            }
            array[i]=((int)(n1/Math.pow(10,i)))%10;
        }
        int []count=new int[9];
        for (int i=0;i<k;i++){
            int num=array[i];
            switch (num){
                case 0:
                    count[0]++;
                    break;
                case 1:
                    count[1]++;
                    break;
                case 2:
                    count[2]++;
                    break;
                case 3:
                    count[3]++;
                    break;
                case 4:
                    count[4]++;
                    break;
                case 5:
                    count[5]++;
                    break;
                case 6:
                    count[6]++;
                    break;
                case 7:
                    count[7]++;
                    break;
                case 8:
                    count[8]++;
                    break;
                case 9:
                    count[9]++;
                    break;
            }
        }
        for (int i=0;i<count.length;i++){
            if (count[i]==0){
                continue;
            }
            System.out.println(i+":"+count[i]);
        }
    }
}
