package javaclass;

import java.util.*;

public class SimpleErrorRecount {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer>map=new LinkedHashMap<String, Integer>();
        String key;
        String filename;//文件名
        String path;//路径
        while (scanner.hasNext()){
            path=scanner.next();
            int id=path.lastIndexOf("\\");
            filename=id<0 ?path:path.substring(id+1);
            int linenum=scanner.nextInt();
            key=filename+" "+linenum;
            if (map.containsKey(key)){
                map.put(key,map.get(key+1));
            }else{
                map.put(key,1);
            }
        }
        scanner.close();

    //对记录进行排序
    List<Map.Entry<String,Integer>>list=new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return (o2.getValue()-o1.getValue())==0?(o1.getValue()-o2.getValue()):(o2.getValue()-o1.getValue());
        }
    });
    int n=0;
    for (Map.Entry<String,Integer>mapping:list){
        n++;
        if (n<=8){
            String[]str=mapping.getKey().split(" ");
            String k=str[0].length()>16?str[0].substring(str[0].length()-16):str[0];
            String m=str[1];
            System.out.println(k+" "+m+" "+mapping.getValue());
        }else {
            break;
        }
    }
}
}