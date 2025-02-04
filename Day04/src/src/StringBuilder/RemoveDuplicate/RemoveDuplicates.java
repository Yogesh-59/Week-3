package StringBuilder.RemoveDuplicate;
import java.util.*;
import java.util.HashSet;
public class RemoveDuplicates {
    //make the instance of class
    public String str;
    //using constructor to initialize the instance
      RemoveDuplicates(String str){
          this.str=str;
      }
      //Method to remove the duplicate's
      public String removeDuplicate() {
          StringBuilder sb = new StringBuilder();
          //HashSet used to store a collection of unique elements
          HashSet<Character> hashSet = new HashSet<>();
          for (char ch : str.toCharArray()) {
              if (!hashSet.contains(ch)) {
                  hashSet.add(ch);
                  sb.append(ch);
              }
          }
          return sb.toString();
      }
}
