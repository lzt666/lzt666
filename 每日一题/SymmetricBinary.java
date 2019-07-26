package javaclass;

import javax.swing.tree.TreeNode;
public class SymmetricBinary {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val=x;
        }
    }
    public boolean isSymtric(TreeNode root){
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        return (n1.val == n2.val) && isMirror(n1.right, n2.left) && isMirror(n2.right, n1.left);
    }
}
