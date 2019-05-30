package com.bittech.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Author: secondriver
 * Created: 2019/5/28
 */
public class TestSerializable {
    
    public static void code1(){
        //序列化
        Person person = new Person();
        person.setAge(28);
        person.setName("Tom");
        person.setBirthday(new Date());
        person.setSkills(new String[]{"Java", "C++", "Shell"});
    
        try (ObjectOutputStream oout =
                     new ObjectOutputStream(new FileOutputStream("D:" + File.separator + "__test" + File.separator + "Person.data"))) {
            //Object -> byte[]
            oout.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void code2(){
        //反序列化
        File file = new File("D:"+File.separator+"__test"+File.separator+"Person.data");
    
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))){
        
            Object object = oin.readObject();
            Person person = (Person)object; //CCE
            System.out.println(person);
        
        }catch (IOException e){
        
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
       
        code2();
        
    
    }
}
