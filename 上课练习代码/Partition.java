
package javaclass;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
       if (pHead==null){
           return pHead;
       }
       ListNode list1=new ListNode(0);
       ListNode list2=new ListNode(0);
       ListNode result=list1;
       ListNode tmp=list2;
       while (pHead!=null){
           if (pHead.val<x){
               list1.next=pHead;
               list1=list1.next;
               pHead=pHead.next;
           }else {
               list2.next=pHead;
               list2=list2.next;
               pHead=pHead.next;
           }
       }
       list1.next=result;
       list2.next=null;
       return result.next;
    }
}
/*
import javax.xml.soap.Node;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DeleteLikNode {
    public static void main(String[] args)throws IOException {o
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        Random rand=new Random();
        StuLinkedList list=new StuLinkedList();
        int i,j,finsdword=0,data[][]=new int[12][10];
        String name[]=new String[]{"allan","scott","marry","jon","mark","ricky","lisa","jasica","hanson","amy","bob","jack"};
        System.out.println("学号***************成绩");
        for (i=0;i<12;i++){
            data[i][0]=i+1;
            data[i][1]=(Math.abs(rand.nextInt(50)))+50;
            list.insert(data[i][0],name[i],data[i][1]);
        }
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                System.out.println("["+data[j*3+i][0]+"]["+data[j*3+i][1]+"]");
                System.out.println();
            }
            while (true){
                System.out.println("输入要删除成绩的学号，结束输入-1:");
                finsdword  =Integer.parseInt(buf.readLine());
                if (finsdword==-1){
                    break;
                    else{
                        Node cur=new Node(list.first.data,list.first.names,list.first.np);
                        cur.next=list.first.next;
                        list.delete(cur);
                    }
                    System.out.println(" ");
                    list.print();
                }
            }
        }
    }

    private static class StuLinkedList {
        public Object first;

        public void print() {
        }
    }
}
*/
