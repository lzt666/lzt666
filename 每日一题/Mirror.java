package javaclass;
//二叉树的镜像
public class Mirror {
    class TreeNode{
        int val=0;
        TreeNode left=null;
        TreeNode right=null;
        public TreeNode(int val){
            this.val=val;
        }
    }
    public void Mirror(TreeNode root){
        TreeNode temp;
        if (root!=null){
            temp=root.left;
            root.left=root.right;
            root.right=temp;
            if (root.left!=null){
                Mirror(root.left);
            }
            if (root.right!=null){
                Mirror(root.right);
            }
        }
    }
}
