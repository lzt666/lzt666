package javaclass;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class TreeNode1 {
     private  static int x=100;

    public static void main(String[] args) {
        TreeNode1 t1=new TreeNode1();
        t1.x++;
        TreeNode1 t2=new TreeNode1();
        t2.x++;
        t1=new TreeNode1();
        t1.x++;
        TreeNode1.x--;
        System.out.println("x="+x);
    }
 }
