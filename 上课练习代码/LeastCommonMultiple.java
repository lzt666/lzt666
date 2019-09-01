package javaclass;

import java.util.Scanner;

public class LeastCommonMultiple {
    public static int gcd(int A,int B){
        int max,min;
        max=(A>B)?A:B;
        min=(A<B)?A:B;
        if (max%min!=0){
            return gcd(min,max%min);
        }else
            return min;
    }
    public static int lcm(int A,int B){
        return A*B/gcd(A, B);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sc1=scanner.nextInt();
        int sc2=scanner.nextInt();
        System.out.println("("+sc1+","+sc2+")"+"="+lcm(sc1,sc2));//最小公倍数
        System.out.println("("+sc1+","+sc2+")"+"="+gcd(sc1,sc2));//最大公约数
    }
}
