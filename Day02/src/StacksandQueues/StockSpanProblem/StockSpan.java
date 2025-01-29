package StacksandQueues.StockSpanProblem;
import java.util.*;
public class StockSpan {
    public static int[] calculateSpan(int []price){
        int len=price.length;
        int []span =new int[price.length];
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<len;++i){
            while( !st.isEmpty() && price[st.peek()] <=price[i]){
              st.pop();
            }
            span[i] =st.isEmpty() ?(i+1) :(i-st.peek());
            st.push(i);
        }
        return span;
    }
    public static void main(String[]args){
        int[] price={25,65,34,76,89,67,34,65,78,23};
        int []span=calculateSpan(price);
         for (int num:span){
             System.out.print(num+" ");
         }
         System.out.println();
    }
}
