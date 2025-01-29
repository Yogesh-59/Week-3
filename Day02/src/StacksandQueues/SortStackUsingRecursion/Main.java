package StacksandQueues.SortStackUsingRecursion;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        //creating the object of class and call
        StackSort st1=new StackSort();
        //indert element in stack
        st1.insert(7);
        st1.insert(67);
        st1.insert(27);
        st1.insert(77);
        st1.insert(47);
        st1.insert(97);
        //calling sort method
        st1.sort();
        System.out.println("Sorted stack is :"+ st1);

    }
}
