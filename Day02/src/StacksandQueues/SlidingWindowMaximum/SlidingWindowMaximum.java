package StacksandQueues.SlidingWindowMaximum;

import java.util.*;

public class SlidingWindowMaximum {
    public static int[] slidingWindow(int []nums,int k){
        if(nums ==null || nums.length==0 || k<=0){
            return new int[0];
        }
        int len=nums.length;
        int []res=new int[len -k+1];
        Deque<Integer> dq=new LinkedList<>();
        for (int i=0;i<k;++i){
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k;i<len;++i){
            res[i-k]=nums[dq.peekFirst()];
             if(dq.peekFirst() == i-k){
                   dq.removeFirst();
             }
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res[len - k] = nums[dq.peekFirst()];

        return res;
    }
    public static void main(String[]args){
        int [] arr={1,7,3,-8,-4,6,9,2,5,10};
        int k=7;
        int [] res=slidingWindow(arr ,k);
        System.out.println("Maximums of each window:");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
