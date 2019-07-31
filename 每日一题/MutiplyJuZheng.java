package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MutiplyJuZheng {
    public static void main(String[] args) throws IOException {
     int m,n,p;
     int i,j;
     String strm;
     String strn;
     String strp;
     String tempstr;
        BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入矩阵A的维数(m,n)：");
        System.out.print("请输入矩阵A的m值：");
        strm=keyin.readLine();
        m=Integer.parseInt(strm);
        System.out.print("接着输出矩阵A的n值：");
        strn=keyin.readLine();
        n=Integer.parseInt(strn);
        int A[][]=new int[m][n] ;
        System.out.println("[请输入矩阵A的各个元素]");
        System.out.println("注意！！每输入一个值按下Enter键确认输入");
        for ( i=0;i<m;i++){
            for (j=0;j<n;j++){
                System.out.print("a"+i+j+"=");
                tempstr=keyin.readLine();
                A[i][j]=Integer.parseInt(tempstr);
            }
            System.out.println("请输入矩阵B的维数(n,p):");
            System.out.print("请先输入矩阵B的n值：");
            strn=keyin.readLine();
            n=Integer.parseInt(strn);
            System.out.print("紧接着输出矩阵B的p值：");
            strp=keyin.readLine();
            p=Integer.parseInt(strp);
            int B[][]=new int[n][p];
            System.out.println("[请输入矩阵B的各个元素：]");
            System.out.println("注意！！每输入一个值按下Enter键确认输入");
            for ( i=0;i<n;i++){
                for (j=0;j<p;j++){
                    System.out.print("b"+i+j+"=");
                    tempstr=keyin.readLine();
                    B[i][j]=Integer.parseInt(tempstr);
                }
                int C[][]=new int[m][p];
                MatrixMultiply(A,B,C,m,n,p);
                System.out.println("[A*B的结果是]");
                for (i=0;i<m;i++){
                    for (j=0;j<p;j++){
                        System.out.print(C[i][j]);
                        System.out.print('\t');
                    }
                    System.out.println();
                }
        }

    }
}

    private static void MatrixMultiply(int[][] arrA, int[][]arrB, int[][] arrC, int m, int n, int p) {
        int i,j,k,temp;
        if (m<=0||n<=0|p<=0){
            System.out.println("[错误！维数m,n,p必须大于0]");
            return;
        }
        for (i=0;i<m;i++){
            for (j=0;j<n;j++){
                temp=0;
                for (k=0;k<n;k++){
                    temp=temp+arrA[i][k]*arrB[k][j];
                    arrC[i][j]=temp;
                }
            }
        }
    }
    }
