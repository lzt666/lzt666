package com.bittech.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author: secondriver
 * Created: 2019/5/28
 */
public class TestBufferedReader {
    
    public static void readKeyBoard() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        )) {
            System.out.println("从键盘读取一行数据");
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("D:" + File.separator + "__test" + File.separator + "java.txt")
        )) {
            System.out.println("从文件中读取数据");
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
