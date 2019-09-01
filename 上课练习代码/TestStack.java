package javaclass;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("java");
        stack.push("C++");
        stack.push("Python");
        stack.push("GoLang");
        System.out.println("栈的大小："+stack.size());
        System.out.println("栈是否为空："+stack.isEmpty());
        System.out.println("观察栈顶："+stack.peek());
        System.out.println("出栈："+stack.pop());
        System.out.println("出栈："+stack.pop());
        System.out.println("出栈："+stack.pop());
        System.out.println("出栈："+stack.pop());



    }
}
