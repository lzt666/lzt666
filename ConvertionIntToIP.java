package javaclass;

import java.util.Scanner;

public class ConvertionIntToIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ip = scanner.next();
            long number = scanner.nextLong();
            int n;
            StringBuffer result = new StringBuffer();
            StringBuffer sb, temp;
            StringBuffer ipsb = new StringBuffer();
            String[] ips;
            ips = ip.split("\\.");
            for (int i = 0; i < ips.length; i++) {
                n = Integer.parseInt(ips[i]);
                temp = new StringBuffer(Integer.toBinaryString(n));
                while (temp.length() < 8) {
                    temp.insert(0, '0');
                }
                ipsb = ipsb.append(temp);
            }
            sb = new StringBuffer(Long.toBinaryString(number));
            while (sb.length() < 32) {
                sb.insert(0, '0');
            }
            for (int i = 0; i < 25; i += 8) {
                long count = count(sb.substring(i, i + 8));
                result.append(count + ".");
            }
            System.out.println(count(ipsb.toString()));
            System.out.println(result.substring(0, result.length() - 1));

        }
    }
    public static long count(String s) {
        int length = s.length();
        long number = 0;
        int j = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                number += (long) Math.pow(2, j);
            j++;
        }
        return number;
    }
}
