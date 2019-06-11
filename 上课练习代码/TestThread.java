package Test_code;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;

import java.util.Objects;

class MyThread implements Runnable{
    private boolean flag;
    private Object obj;
    public MyThread(boolean flag, Object obj){
        super();
        this.flag=flag;
        this.obj=obj;

    }
    public void waitMethod(){
        synchronized (obj){
            try{
                while (true){
                    System.out.println("wait()方法开始"+Thread.currentThread().getName());
                    obj.wait();
                    System.out.println("wait()方法结束"+Thread.currentThread().getName());
                    return;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void notifyMethod(){
        synchronized (obj){
            try{
                System.out.println("notify()方法开始"+Thread.currentThread().getName());
                obj.notify();
                System.out.println("noyify()方法结束"+Thread.currentThread().getName());

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run(){
        if (flag){
            this.waitMethod();
        }else {
            this.notifyMethod();
        }
    }
}
public class TestThread {
    public static void main(String[] args) throws InterruptedException{
        Object object = new Object() {
            @Override
            public boolean _is_a(String repositoryIdentifier) {
                return false;
            }

            @Override
            public boolean _is_equivalent(Object other) {
                return false;
            }

            @Override
            public boolean _non_existent() {
                return false;
            }

            @Override
            public int _hash(int maximum) {
                return 0;
            }

            @Override
            public Object _duplicate() {
                return null;
            }

            @Override
            public void _release() {

            }

            @Override
            public Object _get_interface_def() {
                return null;
            }

            @Override
            public Request _request(String operation) {
                return null;
            }

            @Override
            public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result) {
                return null;
            }

            @Override
            public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result, ExceptionList exclist, ContextList ctxlist) {
                return null;
            }

            @Override
            public Policy _get_policy(int policy_type) {
                return null;
            }

            @Override
            public DomainManager[] _get_domain_managers() {
                return new DomainManager[0];
            }

            @Override
            public Object _set_policy_override(Policy[] policies, SetOverrideType set_add) {
                return null;
            }
        };
        MyThread waitThread = new MyThread(true, object);
        MyThread notifyThread = new MyThread(false, object);
        Thread thread1 = new Thread(waitThread, "wait线程");
        Thread thread2 = new Thread(notifyThread, "notify线程");
        thread1.start();   Thread.sleep(1000);
        thread2.start();
        System.out.println("main方法结束!!");
    }
}
