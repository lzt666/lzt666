package javaclass;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    //链式二叉树
    class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;

        public TreeNode(char val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public int i = 0;

    //根据 字符串创建二叉树，先序遍历
    TreeNode CreateStringBinaryTree(String s) {
        TreeNode root = null;
        if (s.charAt(i) != '#') {//如火对应字符不是#，那么创建根节点
            root = new TreeNode(s.charAt(i));
            i++;
            root.left = CreateStringBinaryTree(s);
            root.right = CreateStringBinaryTree(s);
        } else {
            i++;//如果是#，那么下标直接++；
        }
        return root;

    }


    //二叉树的前序遍历
    void binaryTreePrevOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val + " ");
        binaryTreePrevOrder(root.left);
        binaryTreePrevOrder(root.right);

    }


    // 二叉树的中序遍历
    void binaryTreeInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        binaryTreeInOrder(root.left);
        System.out.println(root.val + "");
        binaryTreeInOrder(root.right);


    }

    //二叉树的后序遍历
    void binaryTreePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        binaryTreeInOrder(root.left);
        binaryTreeInOrder(root.right);
        System.out.println(root.val + "");
    }

    int getSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSize(root.left) + getSize(root.right) + 1;

       /* int i=0,j=0;
        getSize(root.left);
        i++;
        getSize(root.left);
        j++;
        return i+j+1;*/

    }

    int getLeafSize(TreeNode root) {//计算叶子节点的数量
        if (root == null) {
            return 0;
        }
        if (root.right == null && root.left == null) {
            return 1;
        }
        return getLeafSize(root.right) + getLeafSize(root.left);
    }

    int getKLevelSize(TreeNode root, int k) {//层次遍历层数
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k - 1) +
                getKLevelSize(root.right, k - 1);

    }


    TreeNode find(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (root.val == value) {
            return root;
        }
        TreeNode r = find(root.left, value);
        if (r != null) {
            return r;
        }
        r = find(root.right, value);
        if (r != null) {
            return r;
        }
        return null;
    }

    int Height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(Height(root.left), Height(root.right)) + 1;
    }

    void binaryTreePrevOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode top = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                System.out.println(cur.val + " ");
                stack.push(cur);
                cur = cur.left;
            }
            top = stack.pop();
            cur = cur.right;
        }
    }

    void binaryTreeInOrderNonr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode top = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);

                cur = cur.left;

            }
            cur = stack.pop();
            System.out.println(cur.val + "");
            cur = cur.right;
        }
    }


    void binaryTreePostOrderNonR(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == pre) {
                System.out.print(cur.val + " ");
                stack.pop();
                pre = cur;//
                cur = null;
            } else {
                cur = cur.right;
            }
        }
    }

    void binaryTreeLevelOrder(TreeNode root) {//二叉树的层次遍历
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.peek();
            System.out.println(cur.val + "");
            queue.poll();
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }

    int binaryTreeComplete(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);

            } else {
                break;
            }
        }
    return -1;
}


        public static void main (String[]args){
            BinaryTree binaryTree = new BinaryTree();
            String s = "ABC##DE#G##F###";
            TreeNode root = binaryTree.CreateStringBinaryTree(s);
            binaryTree.Height(root);
            System.out.println(binaryTree.Height(root));
            binaryTree.binaryTreePostOrderNonR(root);
            binaryTree.getKLevelSize(root, 4);
            System.out.println(" ");
            System.out.println(binaryTree.getKLevelSize(root, 4));
            binaryTree.binaryTreeLevelOrder(root);
            System.out.println("");
            System.out.println(binaryTree.binaryTreeComplete(root));
        }
    }
