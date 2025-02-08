package ArrayVsHashSetVsTreeSet;

import java.util.TreeSet;

public class TreeSetSearch {
    //Make instance of class
    public TreeSet<Integer> treeSet=new TreeSet<>();
    //Method to search target element in tree Set
     public int treeSerSearch(int []data,int target){
         for (int it:data){
             treeSet.add(it);
         }
         if(treeSet.contains(target)){
             return 1;
         }
         return -1;
     }
}
