package javaclass;

import java.util.Scanner;

public class CycleRodomAndVim {
    //给定球的中心点和球的某一点的坐标，计算球的半径与体积
    //球的体积计算公式是V=(4/3)*3.14*R^3
    //球的半径是x1^2+x2^2+x3^2=R2
    //定义数据变量
    public static void main(String[] args) {
        double x0,x1,y0,y1,z0,z1;
        double R;
        double V;
        Scanner scanner=new Scanner(System.in);
        x0=Integer.valueOf(scanner.next());
        y0=Integer.valueOf(scanner.next());
        z0=Integer.valueOf(scanner.next());
        x1=Integer.valueOf(scanner.next());
        y1=Integer.valueOf(scanner.next());
        z1=Integer.valueOf(scanner.next());
        double Xm=(x1-x0);
        double Ym=(y1-y0);
        double Zm=(z1-z0);
        double Sum=Math.pow(Xm,2)+Math.pow(Ym,2)+Math.pow(Zm,2);
        R=Math.sqrt(Sum);
        V=(4.0d/3.0d)*Math.PI*Math.pow(R,3);
        System.out.printf("%.3f",R);
        System.out.println(" ");
        System.out.printf("%.3f",V);
    }

}
