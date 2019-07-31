package javaclass;

public class ThreadLocal {
    private  static String commonStr;
    private static ThreadLocal threadLocal=new ThreadLocal();

    public static void main(String[] args) {

        commonStr="main";
        threadLocal.set("main-thread-value");
        //main线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                commonStr="thread-A";
                threadLocal.set("A-thread-value");
            }
        },"Thread-A").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"commonStr="+commonStr);
        System.out.println(Thread.currentThread().getName()+"ThreadLocal="+threadLocal.get());
    }

    private String get() {

    return null;
    }

    private void set(String s) {
        return;
    }
    }
