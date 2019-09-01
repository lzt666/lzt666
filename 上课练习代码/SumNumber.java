package javaclass;
import java.util.Scanner;
public class SumNumber {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                int n2 = n*n;
                int sum = 0;
                while(n>=1){
                    sum+=n%10;
                    n=n/10;
                }
                System.out.print(sum+" ");
                sum=0;
                while(n2>=1){
                    sum+=n2%10;
                    n2=n2/10;
                }
                System.out.println(sum);
            }
        }
    }
