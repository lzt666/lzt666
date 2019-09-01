package javaclass;

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int limit=-1;
        for (int k=0;k<n-1;k++){
            int left=-1;
            int right=-1;
            for (int i=0;i<n;i++){
                if (i<=k){
                    left=Math.max(left,A[i]);
                }else {
                    right=Math.max(right,A[i]);
                }
            }
            limit=Math.max(Math.abs(left-right),limit);
        }
        return limit;
    }
}
