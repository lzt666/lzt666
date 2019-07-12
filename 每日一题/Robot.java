package javaclass;
import java.util.Scanner;
public class Robot {

    public static void main(String[] args) {

    }

    }
       /* Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
            static void pong() {
                System.out.println("pong");
            }*/

       /* java.util.HashMap map=new java.util.HashMap();
        map.put("name",null);
        map.put("name","Jack");
        System.out.println(map.size());*/
    /*public int countWays(int x, int y) {
        if(x==0 || y==0)
            return 0;
        else if(x==1 || y==1)
            return 1;
        else{
            int [][]f = new int[x][y];
            for(int i=0;i<x;i++){
                f[i][0] = 1;
            }
            for(int i=0;i<y;i++){
                f[0][i] = 1;
            }
            for(int i=1;i<x;i++){
                for(int j=1;j<y;j++){
                    f[i][j] = f[i-1][j]+f[i][j-1];
                }
            }
            return f[x-1][y-1];
        }
    }
}*/
 /*   public int countWays(int[][] map, int x, int y) {
        return countdym(map, x, y);
    }
    public int countdym(int[][] map, int x, int y) {
        int[][] target = new int[x][y];
        boolean flag = true;
        for (int i = 0; i < y; i++) {
            if (map[0][i] == 1 && flag) {
                target[0][i] = 1;
            } else {
                flag = false;
                target[0][i] = 0;
            }
        }
        flag = true;
        for (int i = 0; i < x; i++) {
            if (map[i][0] == 1 && flag) {
                target[i][0] = 1;
            } else {
                flag = false;
                target[i][0] = 0;
            }
        }
        for (int i = 1; i < x; i++) {
            for (int j = 1; j < y; j++) {
                if (map[i][j] == 1) {
                    target[i][j] = target[i - 1][j] + target[i][j - 1];
                } else *//*{
                    target[i][j] = 0;
                }
            }
        }
        return target[x - 1][y - 1];
    }
}*/


