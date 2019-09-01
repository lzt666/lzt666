package javaclass;

public class MillionairQuestion {
    public static void main(String[] args) {
        int num=0;
        for (int i=0;i<30;i++){
            num+=Math.pow(2,i);
        }
        System.out.println(30*10+" "+num);
    }
}
