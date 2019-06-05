package Thread;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestThreadMethod {
   public static void main(String[] args) {
        Thread thread1=new ThreadMethod();
        thread1.start();
        for (int i=0;i<10;i++){
            Runnable runnable1=new RunnableMethod();
            Thread thread2=new Thread(runnable1);
            thread2.setName("业务线程-"+i);
            thread2.start();
        }
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
       // main->Thread(main)
        //java程序-》进程-》JVM-》程序入口-》main(线程)
        //main；自动回收内存，GC(线程)

    }

    public static void main1(String[] args) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        System.out.println(format.format(date));
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss")));
    }
}
class ThreadMethod extends Thread{
    @Override
    public void run(){
        System.out.println(this.getName()+"");
    }
}
class RunnableMethod implements Runnable{
    @Override
    public void run(){
        System.out.println();
    }
}