package javaclass;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
public class HungryYi {
    final static long MOD = 1000000007L;
    final static int MAX = 100000;

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
                 while (in.hasNextLong()) {

            long x = in.nextLong();
                        System.out.println(count(x));
                     }
            }

             private static long count(long x) {
                 Map<Long, Integer> dist = new HashMap<Long, Integer>();//用哈希表存储已访问的点
                 Queue<Long> queue = new LinkedList<Long>();//使用队列存储待访问的点，bfs广度优先遍历
                dist.put(x, 0);
                queue.add(x);
                while (!queue.isEmpty()) {
                        long d;
                       Long top = queue.poll();
                       if (dist.get(top) > MAX)
                                break;
                        if (top == 0) {
                                 return dist.get(top);
                             }
                        d = ((top << 2) + 3) % MOD;
                       if (d == 0) {
                return dist.get(top) + 1;
                             }
                        if (!dist.containsKey(d)) {
                                 queue.add(d);
                                dist.put(d, dist.get(top) + 1);
                            }
                d = ((top << 3) + 7) % MOD;
                       if (d == 0) {
                               return dist.get(top) + 1;
                             }
                         if (!dist.containsKey(d)) {
                                 queue.add(d);
                                dist.put(d, dist.get(top) + 1);
                             }
                   }
                return -1L;
           }

         }