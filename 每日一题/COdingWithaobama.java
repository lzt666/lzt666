package javaclass;

import java.util.Scanner;

public class COdingWithaobama {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String c = scanner.next();
        for (int i = 1; i <= N; i++) {
            System.out.print(c);
        }
        System.out.println();
        for (int i = 1; i <= Math.ceil((double) N / 2) - 2; i++) {
            System.out.print(c);
            for (int j = 2; j <= N - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(c);
        }
    }
}
/*

    abstract class Animal {
        abstract void say();
    }
*/

 /*   public class Cat extends Animal {
        public Cat() {
            System.out.println("I am Cat");

        }

        public static void main(String[] args) {
            Cat cat = new Cat();
        }*/




/*

        Thread t = new Thread() {
            public void run() {
                dianping();
            }

        };
        t.run();
        System.out.println("dazhong");

    }

    static void dianping() {
        System.out.println("dianping");
    }
}
*/

    /*static boolean out(char c){
        System.out.println(c);
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        for (out('A');out('B')&&(i<2);out('C')){
            i++;
            out('D');
        }
    }*/


