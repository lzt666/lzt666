package javaclass;

import java.util.Scanner;

public class WashingCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int P=scanner.nextInt();
                while(P-->0){
            int n=scanner.nextInt();
            int k=scanner.nextInt();
            int []reset=new int[2*n];
            for (int  i=0;i<2*n;i++){
                int temp=i+1;
                for (int j=0;j<k;j++){
                    if (temp<=n)
                        temp=2*temp-1;
                    else
                        temp=2*(temp-n);
                }
                reset[temp-1]=scanner.nextInt();
            }
            if (reset.length>0)
                System.out.print(reset[0]);
                for (int i=1;i<2*n;i++){
                    System.out.print(" "+reset[i]);
                }
                System.out.println();

                }
    }
}
