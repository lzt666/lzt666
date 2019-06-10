public class TestDemo1 {

    //静态代码块
    static {
        System.out.println("静态代码块执行");
    }
    //构造方法
    public  TestDemo1(){
        System.out.println("构造方法执行");
    }
    //构造代码块
    {
        System.out.println("构造代码块执行");
    }

    public static void main(String[] args) {
        System.out.println("main方法开始执行");
        System.out.println("创建第一个对象");
        new TestDemo1();
        System.out.println("创建第二个对象");
        new TestDemo1();
        System.out.println("创建第三个对象");
        new TestDemo1();

    }
    }
