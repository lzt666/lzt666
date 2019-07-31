package javaclass;

import java.util.TreeMap;

public class Gift {
    public int getValue(int[] gifts, int n) {
        int money = 0;
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (n > 1) {
                if (map.get(gifts[i]) == null)
                    map.put(gifts[i], 1);
            } else {
                int num = map.get(gifts[i]).intValue();
                num++;
                if (num > n / 2)
                    return money = gifts[i];
                map.put(gifts[i], num);
            }
        }

        /*  int count=1;
          int reg=gifts[0];
          for (int i=1;i<n;i++){
              if (gifts[i]!=reg){
                  count--;
                  if (count==0){
                      count=1;
                      reg=gifts[i];
                  }
              }else {
                  count++;
              }
          }
          count=0;
          for (int i=0;i<n;i++){
              if (gifts[i]==reg){
                  count++;
              }
          }
          if (count>n/2) {
              return reg;
          }return 0;*/
        // write code here
        return money;
    }
}