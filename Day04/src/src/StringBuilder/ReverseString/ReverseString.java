package StringBuilder.ReverseString;
import java.util.*;
public class ReverseString {
    //creating the instance of class
    public String str;
    //using constructor to initialize the instance
    ReverseString(String str){
        this.str=str;
    }
    //method to reverse String using String Builder
    public String reverseStr(){
        //creat the object of String builder
        StringBuilder sb=new StringBuilder();
        //append method to appending one string to another
         sb.append(str);
         //reverse method to reverse string
         sb.reverse();
         //return the reverse string
         return sb.toString();
    }
}
