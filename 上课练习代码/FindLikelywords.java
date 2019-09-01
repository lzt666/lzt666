package javaclass;
import java.util.*;
public class FindLikelywords {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                int n = sc.nextInt();
                List<String> list = new LinkedList<String>();
                List<String> findlist = new LinkedList<String>();
                for(int i=0; i<n; i++) {
                    list.add(sc.next());
                }
                String find = sc.next();
                int index = sc.nextInt();
                Collections.sort(list);
                int cnt = 0;
                for(int j=0; j<list.size(); j++) {
                    String jStr = list.get(j);
                    boolean flag = true;
                    if(jStr.length() == find.length()) {
                        if(!jStr.equals(find)) {
                            char[] chars = find.toCharArray();
                            for(int k=0; k<chars.length; k++) {
                                if(jStr.contains(String.valueOf(chars[k]))) {
                                    jStr = jStr.replaceFirst(String.valueOf(chars[k]),"");
                                } else {
                                    flag = false;
                                }
                            }
                        } else {
                            flag = false;
                        }
                        if(flag) {
                            findlist.add(list.get(j));
                            cnt++;
                        }
                    }
                }
                System.out.println(cnt);
                if(findlist.size() >= index)
                    System.out.println(findlist.get(index-1));
            }
        }
    }

