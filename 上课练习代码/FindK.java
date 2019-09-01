package javaclass;

import java.util.Scanner;

public class FindK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] number = new int[n];

            for (int i = 0; i < number.length; i++) {
                number[i]=scanner.nextInt();
            }
                int x = scanner.nextInt();
            System.out.println(findx(x,number));
        }
    }

    private static int findx(int x, int[] number) {
        for (int i=0;i<number.length;i++){
            if (x==number[i]){
                return i;
            }
        }
        return -1;
    }
}
