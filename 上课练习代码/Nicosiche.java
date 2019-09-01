package javaclass;

import java.util.Scanner;

public class Nicosiche {//尼克斯切数
    public static void main(String args[]){
        Scanner sca = new Scanner(System.in);
        while(sca.hasNext()){
            int num =sca.nextInt();
            if(num%2!=0){
                int mid = num*num;
                StringBuilder sb = new StringBuilder();
                for(int i=mid-num/2*2;i<=mid+num/2*2;i=i+2){
                    sb.append(i+"+");
                }
                System.out.println(sb.toString().substring(0, sb.toString().length()-1));
            }else{
                int midl = num*num-1;
                int midh = num*num+1;
                StringBuilder sb = new StringBuilder();
                for(int i=midl-(num/2-1)*2;i<=midl;i=i+2){
                    sb.append(i+"+");
                }
                for(int i=midh;i<=midh+(num/2-1)*2;i=i+2){
                    sb.append(i+"+");
                }
                System.out.println(sb.toString().substring(0, sb.toString().length()-1));
            }
        }
    }
}
   /* public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        String res="";
        for(int j=n*(n-1)/2;j<n*(n+1)/2;j++){
            if (j!=n*(n+1)/2-1){
                res+=(j*2+1)+"+";
            }else {
                res+=(j*2+1);
            }
        }
        System.out.println(res);
    }*/

