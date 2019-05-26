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


