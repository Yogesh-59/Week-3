package StringBuffer.ConcatenateStrings;

public class Main {
    public static void main(String[] args) {
        //Create the String of Array
        String []str={"Concatenate","String","using","String","Buffer"};
        //Make the object of class and call
        ConcatenateString concatenateStr=new ConcatenateString(str);
        String result=concatenateStr.stringConcatenate();
        //Print the final String
        System.out.println("After concatenation String is: "+result);
    }
}
