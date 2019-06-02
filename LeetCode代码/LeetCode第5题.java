package Test_code;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
public class Solution {
       public double findMedianSortedArrays(int []A,int []B){
              int m=A.length;
              int n= B.length;
              if(m>n){
                     int [] tmp=A;A=B;B=tmp;
                     int  tmp1=m;m=n;n=tmp1;

              }
              int iMin=0,iMax=m,halfLen=(m+n+1)/2;
              while(iMin<=iMax){//
                     int i=(iMin+iMax)/2;
                     int j=halfLen-i;
                     if(i<iMax&&B[j-1]>A[i]){
                            iMin=i+1;
                     }
                     else if (i>iMin&&A[i-1]>B[j]){
                            iMax=i-1;
                     }
                     else{
                            int maxLeft=0;
                            if (i==0){
                                   maxLeft=B[j-1];
                            }else if (j==0){
                                   maxLeft=A[i-1];
                            }
                            else{
                                   maxLeft=Math.max(A[i-1],B[j-1]);
                            }
                            if ((m+n)%2==1){
                                   return maxLeft;
                            }
                            int minRight=0;
                            if (i==m){
                                   minRight=B[j];
                            }else if (j==n){
                                   minRight=A[i];
                            }else{
                                   minRight=Math.min(B[j],A[i]);
                            }
                            return (maxLeft+minRight)/2.0;
                     }
              }
              return 0.0;

       }


}
*/

class Solution {
       /*public String longestPalindrome(String s) {
              if(s==null||s.length()<1)
                     return "";
              int start =0,end =0;
              for(int i=0;i<s.length();i++){
                     int len1=reverseString(s,i,i);
                     int len2=reverseString(s,i,i+1);
                     int len=Math.max(len1,len2);
                     if(len>end-start){
                            start=i-(len-1)/2;
                            end=i+len/2;

                     }
              }
              return s.substring(start,end+1);
       }
       private int reverseString (String s,int left,int right){
              int L=left,R=right;
              while(L>=0 && R <s.length() && s.charAt(L)==s.charAt(R)){
                     L--;
                     R++;

              }
              return  R-L+1;
       }
    */
       public  String convert(String s, int numRows) {
              if(numRows==1)
                     return s;
              StringBuilder set=new StringBuilder();
              int n=s.length();
              int cycleLength=2*numRows-2;
              for(int i=0;i<numRows;i++){
                     for (int m=0;m+i<n;m+=cycleLength){
                            set.append(s.charAt(m+i));
                            if (i!=0&&i!=numRows-1&&m+cycleLength-i<n)
                                   set.append(s.charAt(m+cycleLength-i));

                     }
              }
              return set.toString();
       }

       public static void main(String[] args) {
              String string=new String();
              System.out.println(string);
       }
}
