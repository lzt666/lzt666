package javaclass;

import java.util.Arrays;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class PrevAndProCreateBinaryTree {
    /**
     * inorder 中序遍历顺序
     *  postorder 后序遍历顺序
     */
    public TreeNode BuildTree(int[]inorder,int[]postorder){
        int inlen=inorder.length;
        int pooslen=postorder.length;
        assert inlen==pooslen;
        if (inlen==0){
            return null;
        }else if (inlen==1){
            return new TreeNode(inorder[0]);
        }
        int rootval=postorder[pooslen-1];
        int dividePoint =0;
        for (int i=0;i<inlen;i++){
            if (inorder[i]==rootval){
                dividePoint=i;
                break;
            }
        }
        TreeNode rootNode=new TreeNode(rootval);
        rootNode.left=BuildTree(Arrays.copyOfRange(inorder,0,dividePoint),Arrays.copyOfRange(postorder,0,dividePoint));
        rootNode.right=BuildTree(Arrays.copyOfRange(inorder,dividePoint+1,inlen),Arrays.copyOfRange(postorder,dividePoint,pooslen));
        return rootNode;
    }



}
