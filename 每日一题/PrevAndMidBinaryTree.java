/*
package javaclass;

import java.util.HashMap;
public class PrevAndMidBinaryTree {//做好存储数据的节点
    int preIndex=0;
    int[] preOrder;
    int[] inOrder;
    HashMap<Integer,Integer>index_map=new HashMap<Integer,Integer>();
    public TreeNode helper(int in_left,int in_right){
        if (in_left==in_right){
            return null;
            int root_val=preOrder[preIndex];
            TreeNode root=new TreeNode(root_val);
            int index=index_map.get(root_val);
            preIndex++;
            root.left=helper(in_left,index);
            root.right=helper(index+1,in_right);
            return root;
        }
        public TreeNode buildTree(int[]preOrder,int[]inOrder){
            this.preOrder=preOrder;
            this.inOrder=inOrder;
            int index=0;
            for (Integer val:inOrder)
                index_map.put(val,index++);
            return helper(0,inOrder.length);
        }
    }


}
*/
