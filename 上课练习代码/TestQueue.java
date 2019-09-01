package javaclass;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String>queue=new LinkedList<>();
        queue.add("java");
        queue.add("bobo");
        queue.add("c#");
        queue.add("PHP");
        System.out.println("队列是否为空："+queue.isEmpty());
        System.out.println("队列元素个数"+queue.size());
        System.out.println("出队列："+queue.poll());
        System.out.println("观察队头"+queue.peek());
        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());
        System.out.println("出队列："+queue.poll());
    }
}
