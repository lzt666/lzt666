import java.util.Scanner;

public class Test1
{
public static int isNumeric(String str){
    char[]arr=str.toCharArray();
    int count=0;
    for(int i=0;i<arr.length;i++){
        if((int)arr[i]>=48&&(int)arr[i]<=57){
            count++;

        }
    }
    return  count;
}

    public static void main(String[] args) {
        System.out.println("查找后的数字的个数是:");
        System.out.println(isNumeric("ccznchj5v4s5v466466svd6sv466"));
    }










        }
