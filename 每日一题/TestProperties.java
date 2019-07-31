package javaclass;

import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("java","java is best");
        properties.setProperty("C++","C++ is best too");
        System.out.println(properties.getProperty("C++"));
        System.out.println(properties.getProperty("java"));

        System.out.println(properties.getProperty("php"));
        System.out.println(properties.getProperty("php","php是世界上最好的语言"));
    }
}
