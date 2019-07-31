package javaclass;

import java.util.Scanner;

public class XueFenJiDian {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int gradePoints[]=new int[n];//每门课学分
        int coursePoints[]=new int[n];//每门课分数
        for (int i=0;i<n;i++) {
            gradePoints[i]=in.nextInt() ;
        }
        for (int j=0;j<n;j++){
            coursePoints[j]=in.nextInt();
        }
        in.close();
        System.out.printf("%.2f",gradePointsAverage(gradePoints,coursePoints));//格式输出
    }
     public static double pointOfEachCourse(int grade){//依据成绩进行绩点判断
        double point=0.0;
        if (grade>=90&&grade<=100)
            point=4.0;
         if (grade>=85&&grade<=89)
             point=3.7;
         if (grade>=82&&grade<=84)
             point=3.3;
         if (grade>=78&&grade<=81)
             point=3.0;
         if (grade>=75&&grade<=77)
             point=2.7;
         if (grade>=72&&grade<=74)
             point=2.3;
         if (grade>=68&&grade<=71)
             point=2.0;
         if (grade>=64&&grade<=67)
             point=1.5;
         if (grade>=60&&grade<=63)
             point=1.0;
         if (grade<60)
             point=0.0;
         return (double) point;
     }
    public static double gradePointsAverage(int[] gradePoints, int[] coursePoints) {//计算平均绩点
    double gradePointTotal=0;
    double gradeOfEachCourseTotal=0;
    for (int i=0;i<gradePoints.length;i++){
        gradePointTotal+=pointOfEachCourse(coursePoints[i])*gradePoints[i];
        gradeOfEachCourseTotal+=gradePoints[i];
    }
    return (double)gradePointTotal/gradeOfEachCourseTotal;
    }
}
