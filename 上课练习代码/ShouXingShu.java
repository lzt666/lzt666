package javaclass;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ShouXingShu {


        public static void main(String []args) throws IOException{
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
            String str=null;
            while((str=bufferedreader.readLine())!=null){
                int n=Integer.parseInt(str);
                String  str1=n*n+"";
                if(str.equals(str1.substring(str1.length()-str.length(),str1.length()))){
                    System.out.println("Yes!");
                }
                else{
                    System.out.println("No!");
                }
            }
        }
    }

