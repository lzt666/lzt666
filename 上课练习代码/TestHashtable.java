package javaclass;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TestHashtable {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(898);
        list.add(464);
        list.add(456);
        list.add(962);
        list.add(445);
        list.add(493);
        list.add(1255);
        list.sort(Integer::compareTo);
        list.sort((o1,o2)-> -1*o1.compareTo(o2));
        System.out.println(list);
    }

    }
     /*   Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put("1","java");
        hashtable.put("2","C++");
        System.out.println(hashtable);*/

