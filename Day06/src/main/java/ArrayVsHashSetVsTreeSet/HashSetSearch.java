package ArrayVsHashSetVsTreeSet;

import java.util.HashSet;

public class HashSetSearch {
    //Creating the instance of class
    public HashSet<Integer> hash=new HashSet<>();
    //Method to search the element in hash Set
    public int hashSetSearch(int[] data,int target){
        for(int it:data){
            hash.add(it);
        }
        if(hash.contains(target)){
            return 1;
        }
        return -1;
    }
}
