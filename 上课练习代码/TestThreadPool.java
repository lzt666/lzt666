/*
package executor;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {//线程池
    public static void main(String[] args) {
        ThreadPoolExecutor executor=new ThreadPoolExecutor(
                corePoolSize:5,
                maxinumPoolSize:10,
                KeepAlive:1,
                TimeUnit.MINUTES,
                new LinkedBlockingDeque<>(),
        new ThreadFactory(){
            final KeepAlive
        }
        new ThreadPoolExecutor.AbortPolicy()//饱和策略
        );
        for (int i=0;i<50;i++){
            final int temp=i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+""+temp);
                }
            });
        }
    }
}
*/
