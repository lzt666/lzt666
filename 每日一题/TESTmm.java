package javaclass;

public class TESTmm {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("A");
        StringBuffer b=new StringBuffer("B");
        operator(a,b);
        System.out.println(a+","+b);
       /* Object o=new Object() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };
        System.out.println(o.equals("Fred"));*/
        /*try{
            int i=100/0;
            System.out.print(i);
        }catch (Exception e){
            System.out.print(1);
            throw new RuntimeException();
        }finally {
            System.out.print(2);
        }
        System.out.print(3);*/
    }

    private static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y=x;
        int Array_a[]=new int[10];
        System.out.println(Array_a[10]);
    }
}
    /*public int add(int a ,int b){
        try{
            return a+b;
    }catch (Exception e){
            System.out.println("catch 语句块");
        }finally {
            System.out.println("finally语句块");
        }return 0;
        }

    public static void main(String[] args) {
        TESTmm tesTmm=new TESTmm();
        System.out.println("和是："+tesTmm.add(9,33));
    }*/

