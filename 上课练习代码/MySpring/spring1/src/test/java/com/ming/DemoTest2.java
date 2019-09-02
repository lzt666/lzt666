package com.ming;


import com.ming.bean.Bean2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest2 {

    private ApplicationContext context = null;

    @Before
    public void initMethod(){
       context  = new ClassPathXmlApplicationContext(new String[]{"applicationContext-test.xml"});
    }

    @Test
    public void testRelevantAAndB(){
        Bean2 bean2 = (Bean2) context.getBean("myBean2");
        /************bean3**************/
        System.out.println("bean2.bean3.id = " + bean2.getBean3().getId());
        System.out.println("bean2.bean3.username = " + bean2.getBean3().getUsername());
        System.out.println("bean2.bean3.addr = " + bean2.getBean3().getAddr());
        /************bean4**************/
        System.out.println("bean2.bean4.id = " + bean2.getBean4().getId());
        System.out.println("bean2.bean4.username = " + bean2.getBean4().getUsername());
        /************bean5**************/
        System.out.println("bean2.bean5.age = " + bean2.getBean5().getAge());


    }
}
