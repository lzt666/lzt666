import javase_first_time.IDoubleLinked;

public class DoubleLinkedList implements IDoubleLinked {
    class Node {
        private int data;
        private Node next;//后驱
        private Node prev;//前驱

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node last;

    public DoubleLinkedList() {
        this.head = null;
        this.last = null;

    }

    @Override
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null)

        {
            this.head = node;
            this.last = node;

        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }

    }


    @Override
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.last = node;
        } else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    private Node searchIndex(int index) {
        checkIndex(index);
        int count = 0;
        Node cur = this.head;
        while (count < index) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > getLength()) {
            throw new UnsupportedOperationException("index不合法");
        }

    }

    @Override
    public boolean addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == getLength()) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node cur = searchIndex(index);

        node.next = cur;
        node.prev = cur.prev;
        node.prev.next = node;
        node.next.prev = node;
        return false;
    }

    @Override
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    @Override
    public int remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;//删除最后一个节点，last需要指回来
                    }
                    return oldData;
                }
            }
            cur = cur.next;
        }
        return -1;
    }
        /*Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                int oldData=cur.data;
                if (cur==this.head) {
                    this.head=this.head.next;
                    this.head.prev=null;

                }else{
                    cur.prev.next=cur.next;
                    if (cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{
                        this.last=cur.prev;
                    }


                }
                return oldData;
            }
            cur=cur.next;
        }
        return -1;*/


    @Override
    public void removeAllKey(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {

                if (cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;

                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
        /*Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){

                if (cur==this.head) {
                    this.head=this.head.next;
                    this.head.prev=null;

                }else{
                    cur.prev.next=cur.next;
                    if (cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{
                        this.last=cur.prev;
                    }


                }

            }
            cur=cur.next;
        }*/


    @Override
    public int getLength() {
        int count = 0;
        Node cur = this.head;
        while (cur != null) {
            count++;
            ;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void display() {
        DoubleLinkedList.Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.data + " ");
            cur = cur.next;

        }
        System.out.println();
        /*DoubleLinkedList.Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();*/
    }


    @Override
    public void clear() {
        while (this.head.next != null) {
            Node cur = this.head.next;
            this.head.next = cur.next;
            cur.prev = null;
        }
        this.head = null;
        this.last = null;
    }

    public Node reverseList() {//单链表的逆置
        Node cur = this.head;
        Node reverseHead = null;
        Node prev = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                reverseHead = cur;

            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return reverseHead;
    }

    public Node deleteDuplication() {//删除重复的节点
        Node newHead = new Node(-1);
        Node cur = this.head;
        Node tmpHead = newHead;
        while (cur != null) {


            if (cur != null && cur.data == cur.next.data) {
                while (cur.next != null & cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
                newHead.next = cur;
            } else {
                newHead.next = cur;
                newHead = cur;
                cur = cur.next;
            }
        }
        return tmpHead.next;
    }

    public boolean chkPalindrome() {//回文结构的单链表
        if (this.head == null) {
            return false;
        } else if (this.head.next == null) {
            return true;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node p = slow.next;
        Node p1 = p.next;
        while (p != null) {
            p.next = slow;
            slow = p;
            p = p1;
            if (p1 != null) {
                p1 = p1.next;
            }
        }
        while (slow != this.head) {
            if (slow.data != this.head.data) {
                return false;
            }
            if (this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
    }

    public void createCycle() {//创建一个环
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next;


    }

    public boolean hasCycle() {//判断是否有环
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast != null && slow != null && fast == slow) {
            return true;
        }
        return false;
    }

    public Node detectckcle() {//给定一个链表，返回链表开始入环的第一个节点，如果链表无环，返回null
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    break;
                }
            }
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = this.head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }
public Node intersectionNode(Node headA,Node headB){//输入两个链表，找出他们的第一个公共节点
        if(headA==null||headB==null)
            return null;
        int headAlength=0;
        int headBlength=0;

        Node pL=headA;
        Node pS=headB;
        while(pL!=null){
            ++headAlength;
            pL=pL.next;

        }
        while (pS!=null){
            ++headBlength;
            pS=pS.next;
        }
        int myLen=headAlength-headBlength;
        if (myLen<0){
            pL=headB;
            pS=headA;
            myLen=headBlength-headAlength;
        }
        for(int i=0;i<myLen;i++){
            pL=pL.next;
        }
        while (pL!=null&&pS!=null&&pL!=pS){
            pL=pL.next;
            pS=pS.next;
        }
        if(pL==pS&&pL!=null&&pS!=null){
            return pL;
        }
        return null;
}




}



