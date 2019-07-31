package javaclass;

import java.util.Scanner;

public class RabbitQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int monthCount = scanner.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
    public  static  int getTotalCount(int monthCount) {
        if (monthCount == 1 || monthCount == 2) {
            return 1;
        } else {
            return getTotalCount(monthCount - 1) + getTotalCount(monthCount - 2);
        }
    }
}