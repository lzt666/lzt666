package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumPlus {//求和

    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[] strings=bufferedReader.readLine().split(" ");
        int n=Integer.parseInt(strings[0]);
        int m=Integer.parseInt(strings[1]);
        int [][]dp= new int[n + 1][];
        for (int i=0;i<=n;i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j - i >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - i];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
