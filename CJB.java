package javaclass;

import java.util.Scanner;

public class CJB {//剪刀石头布
static String judge(int a[]){
    if (a[0]>a[1]&&a[0]>a[2]){
        return "B";
    }else if (a[1]>a[0]&&a[1]>a[2]){
        return "C";
    }else if(a[2]>a[0]&&a[2]>a[1]){
        return"J";}
    else if(a[0]==a[1]&&a[0]>a[2]){
        return"B";}
    else if(a[0]>a[1]&&a[0]==a[2]){
        return"B";}
    else if(a[1]>a[0]&&a[1]==a[2]){
        return"C";}
    else if(a[0]==a[1]&&a[0]==a[2]){
        return"B";}
    return  null;
}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();scanner.nextLine();
        char ar[][]=new char [a][2];
        int j[]=new int [3];
        int jh[]=new int [3];
        int y[]=new int [3];
        int yh[]=new int [3];
        for(int i=0;i<ar.length;i++) {
            String aq[]=scanner.nextLine().split(" ");
            ar[i][0]=aq[0].charAt(0);
            ar[i][1]=aq[1].charAt(0);
            if(ar[i][0]==ar[i][1]) {
                j[1]++;
                y[1]++;
            }
            else if(ar[i][0]=='C'&&ar[i][1]=='J'||ar[i][0]=='J'&&ar[i][1]=='B'||ar[i][0]=='B'&&ar[i][1]=='C' ){
                j[0]++;
                y[2]++;
                if(ar[i][0]=='B')jh[0]++;
                else if(ar[i][0]=='C')jh[1]++;
                else if(ar[i][0]=='J')jh[2]++;
            }
            else if(ar[i][0]=='J'&&ar[i][1]=='C'||ar[i][0]=='B'&&ar[i][1]=='J'||ar[i][0]=='C'&&ar[i][1]=='B' ){
                y[0]++;
                j[2]++;
                if(ar[i][1]=='B')yh[0]++;
                else if(ar[i][1]=='C')yh[1]++;
                else if(ar[i][1]=='J')yh[2]++;

            }
        }
        System.out.println(j[0]+" "+j[1]+" "+j[2]);
        System.out.println(y[0]+" "+y[1]+" "+y[2]);
        System.out.println(judge(jh)+" "+judge(yh));


    }
}
