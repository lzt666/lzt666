package javaclass;

import java.util.*;

public class SearchlongString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.next();
            List<String> list=new ArrayList<String>();
            String s1=s.replaceAll("[a-z]","");//字符串替换，将字符替换为空
            String [] str=s1.split(" ");//以空格分隔字符串
            for (int i=0;i<str.length;i++){
                //把字符串中连续得数字串保存至MAP中，其中key为数字串，value为数字串长度
                if (str[i].length() != 0){//利用空字符串替换会产生空白子串，空子串不予考虑，判断
                    if (str[i].charAt(0) != ' '){
                        list.add(str[i]);
                    }
                }
            }
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {//依据List中的字符串元素长短进行自然排序
                    return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
                }
            });
            StringBuffer stringBuffer=new StringBuffer();//用来存储长度最大且相等的数字串
            for (int i=0;i<list.size();i++){
                if (list.get(i).length()==list.get(list.size()-1).length()){
                    stringBuffer.append(list.get(i));
                }
            }
            System.out.println(stringBuffer+","+list.get(list.size()-1).length());
        }
    }
}
