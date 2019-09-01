package javaclass;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class TicketsRecount {//计票统计

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            int n=scanner.nextInt();//统计人数
            LinkedHashMap<String,Integer>map=new LinkedHashMap<String, Integer>();
            scanner.nextLine();
            String str=scanner.nextLine();
            String[]array=str.split(" ");
            for (int i=0;i<array.length;i++){
                map.put(array[i],0);
            }
            map.put("Invalid",0);
            int count =scanner.nextInt();
            scanner.nextLine();
            String str1=scanner.nextLine();
            String[]array1=str1.split(" ");
            for (String s:array1){
                if (map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String>set=map.keySet();
            for (String s:set) {
                System.out.println(s+" : "+map.get(s));
            }
        }
    }
}
