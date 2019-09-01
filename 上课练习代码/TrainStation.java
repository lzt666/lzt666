package javaclass;

import java.util.*;

public class TrainStation {//火车进站问题；给定一个正整数N代表火车数量，0<N<10,接下来
                             //输入火车进站的序列，一共N辆火车，每辆火车以数字1-9代表，要求以字典排序输出火车出战的序列号
    private static Stack<String>stack=new Stack<String>();
    private static Stack<String>list=new Stack<String>();
    private static List<String>results=new ArrayList<String>();

    public static void main(String[] args) {//外部输入一个数字
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String str= scanner.nextLine();
        process(str);
        scanner.close();
    }

    private static void process(String str) {
        String[]trains=str.split(" ");//火车标号用空格隔开
        for (int i=trains.length-1;i>=0;--i){
            list.push(trains[i]);
        }
        wu ("");
        Collections.sort(results);//字典序排序，从右往左依次增大
        for (String result:results){
            System.out.println(result);
        }
    }

    private static void wu(String s) {
        if (stack.isEmpty()&&list.isEmpty()){
            results.add(s.trim());
            return;
        }
        if (!stack.isEmpty()){
            String str=stack.pop();
            wu(s+" "+str);
            stack.push(str);
        }
        if (!list.isEmpty()){
            String str=list.pop();
            stack.push(str);
            wu(s);
            stack.pop();
            list.push(str);
        }
    }
}
