package LinearSearch.SearchASpecificWord;
import java.util.*;
public class SearchSpecificWord {
    //Creating the instance of class
    public String []arr;
    public String targetWord;
    //using Constructor to initialize the instance
     SearchSpecificWord(String []arr,String targetWord){
         this.arr=arr;
         this.targetWord=targetWord;
     }
     //Method to search word in given String
     public void searchWord(){
         boolean condition=false;
         int len= arr.length;
         for (int i=0;i<len;++i){
             if(arr[i].contains(targetWord)){
                 condition= true;
             }
         }
         //Check if word is found so print the String
         if(condition){
             for(String str:arr)
             System.out.print(str+" ");
         }
         else{
             System.out.println("Not found");
         }
     }
}
