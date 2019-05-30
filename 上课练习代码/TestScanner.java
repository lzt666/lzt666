package com.bittech.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Author: secondriver
 * Created: 2019/5/28
 */
public class TestScanner {
    
    public static void code1() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("从键盘读取数据");
//        if (scanner.hasNext()) {
//            System.out.println(scanner.next());
//        }

//        System.out.println("请输入年龄：");
//        if (scanner.hasNextInt()) {
//            System.out.println(scanner.nextInt());
//        } else {
//            System.out.println("输入的内容不是整数");
//        }
        
        System.out.println("请输入生日：");
        //2019-05-25
        //4-2-2
        //\d -> 0-9
        //{4} -> 出现的次数
        //\d{4}-\d{2}-\d{2}
        //[1-9][0-9]{4,}
        if (scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println(scanner.next());
        } else {
            System.out.println("生日格式不合法");
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        try {
            //\n
            Scanner scanner = new Scanner(new File("D:" + File.separator + "__test" + File.separator + "java1.txt")
            );
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
