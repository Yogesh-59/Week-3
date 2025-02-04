package StringBuilder.RemoveDuplicate;

public class Main {
    public static void main(String[] args) {
        //take the String
        String str="Hello world";
        //Creating the object of class and call
        RemoveDuplicates rd=new RemoveDuplicates(str);
        //calling remove duplicate method
       String result= rd.removeDuplicate();
        System.out.println("After remove Duplicate's String will we : "+result);
    }
}
