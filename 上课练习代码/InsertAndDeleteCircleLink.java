package javaclass;

class Node {
    public int leftsize;
    int data ;
            Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
    }
}
public class InsertAndDeleteCircleLink {
    public Node first;
    public Node last;
    public boolean isEmpty(){
        return first==null;
    }
    public void print(){
        Node current=first;
        while(current!=last){
            System.out.print("["+current.data+"]");
            current=current.next;
        }
        System.out.print("["+current.data+"]");
        System.out.println();
    }
    //插入节点
    public void insert(Node trp){
        Node tmp;
        Node newNode ;
        if (this.isEmpty()){
            first=trp;
            last=trp;
            last.next=first;
        }
        else if (trp.next==null){
            last.next=trp;
            last=trp;
            last.next=first;
        }else {
            newNode=first;
            tmp=first;
            while (newNode.next!=trp.next){
                if (tmp.next==first)
                    break;
                    tmp=newNode;
                    newNode=newNode.next;

            }
            tmp.next=trp;
            trp.next=newNode;
        }
    }
    //删除节点
    public  void delete(Node deleteNode){
        Node newNode;
        Node tmp;
        if (this.isEmpty()){
            System.out.print("[环形链表为空]\n");
            return;
        }
        if (first.data==deleteNode.data){
            first=first.next;
            if (first==null){
                System.out.println("环形链表已经为空了");
                return;
            }
            else if (last.data==deleteNode.data){
                newNode=first;
                while (newNode.next!=last)
                    newNode=newNode.next;
                last=newNode;
                last.next=first;
            }
            else {
                newNode=first;
                tmp=first;
                while (newNode.data!=deleteNode.data){
                    tmp=newNode;
                    newNode=newNode.next;
                }
                tmp.next=deleteNode.next;
            }
        }
    }
}
