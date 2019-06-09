import java.util.ArrayList;
import java.util.Stack;



public class Solution1 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        root.setNext(n1);
        n1.setNext(n2);
        Solution1 mm = new Solution1();
        ArrayList<Integer> list = mm.printListFromTailToHead(root);
        System.out.println("list:" + list);
    }


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());

        }
        return list;

    }
}

       class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }

           public void setNext(ListNode next) {
               this.next = next;
           }
       }