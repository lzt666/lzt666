package Test_code;

import javax.swing.tree.TreeNode;
import java.util.Enumeration;

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
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        return buildTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public TreeNode buildTree(int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
        TreeNode root = new TreeNode(pre[preStart]);
        int rootIn = 0;
        for (; rootIn < in.length; rootIn++) {
            if (in[rootIn] == root.val) {
                break;
            }
        }
        int leftLength = rootIn - inStart;
        int rightLength = inEnd - rootIn;
        if (leftLength > 0) {
            root.left = buildTree(pre, in, preStart + 1, preStart + leftLength, inStart, rootIn - 1);

        }
        if (rightLength > 0) {
            root.right = buildTree(pre, in, preStart + leftLength + 1, preEnd, rootIn + 1, inEnd)
        }
        return root;
    }
}

