package javaclass;

public class count2 {
    public int countNumberOf2s(int n) {
        int res = 0;
        for(int i=1;i<=n;i*=10){
            int a = n/i;
            int b = n%i;
            res += (a+7)/10*i + ((a%10==2)?(b+1):0);
        }
        return res;
        /*int count =0;
        int i;
        if (n<2)
            return 0;
        else if (n<=10)
            return 1;
        else
            for (int j=2;j<=n;j++){
            i=j;
            while (i>0){
                if (i%10==2){
                    count++;
                    i/=10;
                    if (i==0)
                        break;
                }
            }

            }
            return count;
        // write code here*/
    }

}
