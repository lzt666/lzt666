package javaclass;

public class EfrWeiArrayPrint {
    public int[] arrayPrint(int[][] arr, int n) {
        int []result=new int[n*n];
        int index=0;
        int startX=0;
        int startY=n-1;
        while (startX<n){
            int x=startX;
            int y=startY;
            while (x<n&&y<n)
                result[index++]=arr[x++][y++];
            if (startY>0)
                  startY--;
                          else
                              startX++;
        }
        return result;
    }
}
