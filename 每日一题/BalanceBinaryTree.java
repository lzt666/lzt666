package javaclass;

public class BalanceBinaryTree {
    public boolean isBalanceBinaryTree(TreeNode root){
        if (root==null){
            return true;
        }else{
            int left=getDeep(root.left);
            int right=getDeep(root.right);
            if (Math.abs(left-right)<=1){
                return isBalanceBinaryTree(root.left)&&isBalanceBinaryTree(root.right);
            }else{
                return false;
            }
        }
    }

    private int getDeep(TreeNode node) {
        if (node!=null){
            int left=getDeep(node.left);
            int right=getDeep(node.right);
            return left>right?left+1:right+1;
        }else{
            return 0;
        }
    }
}
