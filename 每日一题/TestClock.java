package javaclass;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestClock {
    public static void main(String[] args) {
        Runnable runnable=new TickLockRunnable();
        new Thread(runnable,"黄牛A").start();
        new Thread(runnable,"黄牛B").start();
        new Thread(runnable,"黄牛C").start();
    }
}
class TickLockRunnable implements Runnable{
    private int tick=10;
    private final Lock lock=new ReentrantLock();

    @Override
    public void run() {
        while (this.tick > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.lock.lock();
            try {
                if (this.tick > 0) {
                    System.out.println(Thread.currentThread().getName() + "买票 剩余" + (--this.tick));
                }

            } finally {
                this.lock.unlock();
            }
        }

    }
}