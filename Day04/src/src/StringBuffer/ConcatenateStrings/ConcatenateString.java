package StringBuffer.ConcatenateStrings;
import java.util.*;
public class ConcatenateString {
    //create the instance of class
    public String []str;
    //Initialize the String using Constructor
     ConcatenateString(String[] str){
         this.str=str;
     }
     //Method to append the String
     public String stringConcatenate(){
         StringBuffer sb =new StringBuffer();
         for (String string: str){
             sb.append(string);
         }
         return sb.toString();
     }
}
