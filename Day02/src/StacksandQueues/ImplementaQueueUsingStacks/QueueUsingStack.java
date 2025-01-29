package StacksandQueues.ImplementaQueueUsingStacks;
import java.util.*;
class QueueUsingStack {
    //create the stack is instances of this class
    private Stack<Integer> st1;
    private Stack<Integer> st2;
    //using constructor to initialize the instances
    QueueUsingStack(){
        st1=new Stack<>();
        st2=new Stack<>();
    }
    //Method to insert the data in stack
    public void enqueue(int data){
        st1.push(data);
        //System.out.println("Enqueue is :"+st1);
    }
    //Method to pop the element in stack
    public int dequeue(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if(st2.isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return st2.pop();
    }
    //Method to return the peek element of the stack
    public int peek(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if(st2.isEmpty()){
            throw new RuntimeException("Queue is Empty");
        }
        return st2.peek();
    }
    //method to check weather stack is empty or not
    public boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }

}
