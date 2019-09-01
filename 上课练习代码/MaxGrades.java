package javaclass;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxGrades {

    public static void main(String[] args)throws Exception{
        Scanner s = new Scanner(System.in);
        int[] data = new int[2];
        do{
            data[0] = s.nextInt();
            data[1] = s.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for(int i = 0; i < data[0]; i ++){
                array.add(s.nextInt());
            }
            int num = 0;
            char a ;
            int b,c;
            while(num < data[1]){
                a = s.next().charAt(0);
                b = s.nextInt();
                c = s.nextInt();
                if('Q' == a){
                    int start, end;
                    if(b <= c){
                        start = b - 1;
                        end = c - 1;
                    }else{
                        start = c - 1;
                        end = b - 1;
                    }
                    int max = array.get(start);
                    for(int index = start; index <= end; index ++){
                        if(array.get(index) >= max)
                            max = array.get(index);
                    }
                    //result.add(max);
                    System.out.println(max);
                }
                if('U' == a){
                    int index1 = b - 1;
                    int newValue = c;
                    array.set(index1, newValue);
                }
                s.nextLine();
                num ++;
            }
        }while(s.hasNext());
        s.close();

    }
}
    /*public static void main(String[] args) {
        Scanner  key=new Scanner(System.in);
        while (key.hasNextLine()){
            int action,num;//action表示动作，num表示学生数
            String In=key.nextLine();
            action=getAction(In);
            num=getNum(In);
            In=key.nextLine();
            LogIn(In,data);
            int result[]=new int[action];
            for (int x=0;x<action;x++){
                In=key.nextLine();
                String all [] = In.split(" ");
                if(all[0].equals("Q")){
                    result [x] = compare(data,Integer.parseInt(all[1]),Integer.parseInt(all[2]));
                }else{
                    result[x] = -1 ;
                    data[Integer.parseInt(all[1]) - 1] = Integer.parseInt(all[2]) ;
                }
            }
            for(int x = 0 ; x < result.length ; x ++){
                if(result[x] >= 0){
                    System.out.println(result[x]);
                }
            }}
    }

    public static int compare(int[] data, int x, int y) {
        int all[] = new int [y - x + 1] ;
        int n = 0 ;
        for(int z = x - 1 ; z < y ;z ++){
            all[n] = data [z] ;
            n ++ ;
        }
        Arrays.sort(all);
        return all[all.length - 1] ;
    }
    public static void LogIn(String In, int[] data) {
        String all[] = In.split(" ");
        for(int x = 0 ; x < data.length ; x ++){
            data[x] = Integer.parseInt(all[x]) ;
        }
    }
    public static int getAction(String str){
        String all[] = str.split(" ");
        return Integer.parseInt(all[1]) ;
    }
    public static int getNum(String str){
        String all[] = str.split(" ");
        return Integer.parseInt(all[0]) ;
    }

}*/





