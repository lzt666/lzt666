package javaclass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TheSameGradesStudent {//统计相同分数的学生人数

    /* public static void main(String[] args) {
           Scanner scanner=new Scanner(System.in);
          /* while (scanner.hasNext()){
               int N=scanner.nextInt();
               if (N==0){//当N等于0时，结束
                   return;
               }
               int []arr=new int[N];
               for (int i=0;i<arr.length;i++){
                   arr[i]=scanner.nextInt();//定义一个数组，存放N个学生分数
               }
               int grades=scanner.nextInt();//目标分数
               int count=0;//定义并初始化计数器
               for (int i=0;i<arr.length;i++){
                   if (grades==arr[i]){
                       count++;
                   }
               }
               System.out.println(count);
           }
       }
   }*/
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = reader.readLine()) != null) {
            int count = 0;
            int n = parseInt(str);
            if (n == 0)
                break;
            String line = reader.readLine();
            int grade = parseInt(reader.readLine());
            String[] s = line.split(" ");
            int[] a = new int[s.length];
            for (int i = 0; i < n; i++) {
                a[i] = parseInt(s[i]);
            }
            for (int i = 0; i < n; i++) {
                if (grade == a[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}