package javaDSA;

import java.util.*;

public class StackClass {
    //     static class node{
//        int data;
//        node next;
//        node( int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    static class stack {
//        public static node head;
//
//        public static boolean isEmpty() {
//            return head == null;
//        }
//
//        public static void push(int data) {
//            node newNode = new node(data);
//            if (isEmpty()) {
//                head = newNode;
//                return;
//            }
//            newNode.next = head;
//            head = newNode;
//        }
//
//        public static int pop() {
//            if (isEmpty()) return -1;
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//
//        public static int peek() {
//            if (isEmpty()) return -1;
//            int top = head.data;
//            return top;
//        }
//    }
    public static void pushATBottom( int data, Stack<Integer> s){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushATBottom(data,s);
        s.push(top);
    }
    public static void reverseStack( Stack<Integer> s){
        if(s.isEmpty()) return;
        int top= s.pop();
        reverseStack(s);
        pushATBottom(top,s);
    }
    public static void main(String[] args) {
        //stack s = new stack();
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(34);
        s.push(234);
        pushATBottom(5,s);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        Deque<Integer> q= new LinkedList<>();
    }
}
