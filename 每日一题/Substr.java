package javaclass;

public class Substr {

    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean []res=new boolean[n];
        for (int i=0;i<n;i++){
            res[i]=s.contains(p[i]);
        }
        // write code here
        return res;
    }


}