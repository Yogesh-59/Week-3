package StacksandQueues.ImplementaQueueUsingStacks;
import java.util.*;
class Main {
    public static void main(String[]args){
        //Creating the object of class and call
        QueueUsingStack queue=new QueueUsingStack();
        //push the element in stack
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        //Pop element in stack
        System.out.println("Dequeue is :"+queue.dequeue());
        System.out.println("Dequeue is :"+queue.dequeue());
       //check peek element in the stack
        System.out.println("Peek element is :"+queue.peek());

        queue.enqueue(7);
        //check the stack is empty or not
        System.out.println("Check is Empty "+queue.isEmpty() );

    }
}
