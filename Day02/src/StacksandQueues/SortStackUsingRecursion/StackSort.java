package StacksandQueues.SortStackUsingRecursion;
import java.util.*;
 class StackSort {
     //make the instance of class
     Stack<Integer> st;
     //constructor to initialize the instance
     StackSort(){
         st=new Stack<>();
     }
     //method to insert element in stack
     public void insert(int data){
         st.push(data);
     }
     //Recursive method to sort the element in stack
     public static void insertSorted(Stack<Integer>st, int temp){
        if(st.isEmpty() || st.peek() <= temp ){
            st.push(temp);
            return;
        }
        int value=st.pop();
         insertSorted(st,temp);
         st.push(value);
     }
     //method to check the stack is not empty
     public void sort(){
         if(st.isEmpty()){
             return;
         }
         int temp= st.pop();
         sort();
         insertSorted(st,temp);
     }
     // method to display the result
     public void display(){
         System.out.println("Sorted stack is :"+ st);
     }
     @Override
     public String toString() {
         return st.toString();  // Added toString() method for proper printing
     }
}
