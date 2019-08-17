package javaclass;

import java.util.Scanner;

public class countDays {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();
            int []a = {31,28,31,30,31,30,31,31,30,31,30,31};
            int []b = {31,29,31,30,31,30,31,31,30,31,30,31};

            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                countDays(b,month,day);
            else
                countDays(a, month, day);

        }

        private static void countDays(int[] arr, int month, int day) {
            int sum = 0;
            for (int i = 0; i < month-1; i++) {
                sum += arr[i];
            }
            sum += day;
            System.out.println(sum);
        }

    }

