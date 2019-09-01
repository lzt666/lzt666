package javaclass;



import java.util.Stack;

public class StacksToQueue
{
    Stack<Integer> stack1=new Stack<Integer>() ;
    Stack<Integer> stack2=new Stack<Integer>();
    public void addToTail(int x)//添加元素到队尾   --进队---
    {
        stack1.push(x);

    }
    public int deleteHead()//删除对首      --出队---    不需是队不为空才能删除呀~~~~
    {
        if( pSize()!=0)//队列不为空
        {
            if(stack2.isEmpty())//若stack2为空，则把stack1全部加入stack2
                stack1ToStack2();
            return  stack2.pop();

        }
        else
        {
            System.out.println("队列已经为空，不能执行从队头出队");
            return -1;
        }

    }

    public void stack1ToStack2()//把stack1全部放入stack2
    {
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
    }

    public int pSize()//队列size()
    {
        return  stack1.size()+stack2.size();//两个都为空队列才是空
    }

    public static void main(String[] args)
    {
        StacksToQueue  q=new StacksToQueue ();
        q.addToTail(1);
        q.addToTail(2);
        q.addToTail(3);
        q.addToTail(4);
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
        q.addToTail(5);
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
        System.out.println(q.deleteHead());
    }
}