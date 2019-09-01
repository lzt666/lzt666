package javaclass;

import java.util.ArrayList;

public class PrintJuzheng {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer>list=new ArrayList<>();
        if (matrix ==null||matrix.length==0){
            return list;
        }
        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;//定义上下左右，按照顺时针方向进行打印输出
        while (true){
            //向右走
            for (int i=left;i<=right;i++){
                list.add(matrix[up][i]);
            }
            if (++up>down){
                break;
            }
            //向下走
            for (int i=up;i<=down;i++){
                list.add(matrix[i][right]);
            }
            if (--right<left){
                break;
            }
            //向左走
            for (int i=right;i>=left;i--){
                list.add(matrix[down][i]);
            }
            if (--down<up){
                break;
            }
            //向上走
            for (int i=down;i>=up;i--){
                list.add(matrix[i][left]);
            }
            if (++left>right){
                break;
            }
        }
        return list;
    }
}
