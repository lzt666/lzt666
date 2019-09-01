package javaclass;

import java.util.Scanner;

/*
package javaclass;
import java.util.*;
public class Parenthesis {
public static void main(String[]args){
        boolean bo=Parenthesis.chkParenthesis("(()())",6);
    System.out.println(bo);
    boolean bo1=Parenthesis.chkParenthesis("()a()()",7);
    System.out.println(bo1);
    boolean bo2=Parenthesis.chkParenthesis("()(()()",7);
    System.out.println(bo2);

        }

    public static boolean chkParenthesis(String A, int n) {
        int num=0;
        char[]ch=A.toCharArray();
        boolean bo=true;
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='(')
            num++;
            if (ch[i]==')')
            num--;
        }
        if (num!=0){
            bo=false;
        }
         return bo;
        // write code here
    }
}*/

   /* public static boolean chkParenthesis(String A, int n) {
        int l=0;
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(ch=='('){
                l++;
            }else if(ch==')'){
                if(l>0){
                    l--;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return l==0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        boolean ret=chkParenthesis(str,n);
        System.out.println(ret);
    }
*/
    /*public static boolean chkParenthesis(String A, int n) {
        if (A==null||A.length()<=0)//判断数组是否为0
            return false;
        char[]array=A.toCharArray();//字符串问题转换为字符数组问题
        int count =0;//遍历数组，对左括号数目进行加减
        for (int i=0;i<array.length;i++){
            if (array[i]=='(')
                count++;
            if (array[i]==')')
                count--;
            if (count<0)
                return false;
        }if (count==0)
            return true;
            else
                return false;
        // write code here
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
          int n=scanner.nextInt();
        boolean ret=chkParenthesis(A ,n);
        System.out.println(ret);
    }
}*/
    public class Parenthesis {
       public  boolean chkParenthesis(String A, int n){
           int num=0;
           char[]chars=A.toCharArray();
           for (char ch:chars){
               if (ch=="(".charAt(0))
               num++;
               if (ch==")".charAt(0))
                   num--;
               if (num<0)
                   return false;
           }
           if (num==0)
               return true;
           else return false;
       }
   }