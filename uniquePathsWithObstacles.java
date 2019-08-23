package javaclass;

public class uniquePathsWithObstacles {
    public int uniquePath(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        if (row==0||col==0){
            return 0;
        }
        for (int i=1;i<row;i++){
            obstacleGrid[i][0]=obstacleGrid[i-1][0+obstacleGrid[i][0]];
        }
        for (int j=1;j<col;j++){
            obstacleGrid[0][j]=obstacleGrid[0][j-1]+obstacleGrid[0][j];
        }
        for (int i=1;i<row;i++){
            for (int j=1;j<col;j++){
                obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[row-1][col-1];
    }
}
