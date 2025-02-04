package StringBuilder.ReverseString;

public class Main {
    public static void main(String[] args) {
        //take the String
        String str="Hello";
        //create the object of class and call
        ReverseString rs =new ReverseString(str);
        String ans=rs.reverseStr();
        System.out.println("Reverse String is : "+ans);

    }
}
