/*
package javaclass;

import java.util.*;
public class AntiOrder {
public int count(int[]A,int n){
    int result[]=new int[n];
    if (n==0){result[n-1]=0;return 0;
}
        buildTree(A,n,result);
    int count=0;
    for (int i=0;i<=result.length;i++){
        count+=i-result[i];
    }
    return count;
}

    private void buildTree(int[] a, int n, int[] result) {
        Node head = new Node(A[0]);
        int count = 1;
        while(count<n){//1-n-1个子节点
            Node newnode = new Node(A[count]);
            insertTree(head,newnode);
            result[count]=getLeftNum(head,newnode.val);
            count++;
        }
    }

    public void insertTree(Node head,Node newnode){
        if(newnode.val<=head.val){//判定左侧
            if(head.left!=null){
                insertTree(head.left, newnode);
            }else{
                head.left=newnode;
            }
            head.leftsize++;
        }//if
        else {//右侧
            if(head.right!=null){
                insertTree(head.right, newnode);
            }else {
                head.right = newnode;
            }
        }//else

    }
    public int getLeftNum(Node head,int val){
        if(val==head.val)return head.leftsize;
        else if(val<head.val){
            return getLeftNum(head.left, val);
        }else{
            return head.leftsize+1+getLeftNum(head.right, val);
        }
    }
}
class Node{
    public Node(int val){
        this.val = val;
    }
    int leftsize =0;
    int val;
    Node left,right;
}

*/
