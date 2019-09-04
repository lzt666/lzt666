package com.ming.el;


import org.jcp.xml.dsig.internal.SignerOutputStream;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringELTest {

    private ApplicationContext context = null;

    @Before
    public void testInit(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSpEL(){
        Address address = (Address) context.getBean("address");
        System.out.println("city = " + address.getCity());
        System.out.println("street(spel) = " + address.getStreet());

        Car car = (Car) context.getBean("car");
        System.out.println("brand = " + car.getBrand());
        System.out.println("price = " + car.getPrice()) ;
        System.out.println("tyrperimeter = " + car.getTyrperimeter());

        Person person = (Person)context.getBean("person");
        System.out.println("pName = " + person.getpName());

        System.out.println("city = " + person.getCity());
        System.out.println("car = " + person.getCar());
        System.out.println("info = " + person.getInfo());
    }
}
