package javaclass;

public class UpStatirs {//上楼梯
    public int countWays(int n){
        int m1=1;
        int m2=2;
        int m3=4;
        int result=0;
        if (n==1)
            return m1;
        if (n==2)
            return m2;
        if (n==3)
            return m3;

        for (int i=4;i<=n;i++){
            result=((m1+m2)%1000000007+m3)%1000000007;
            m1=m2;
            m2=m3;
            m3=result;
        }
        return result;
    }
}
