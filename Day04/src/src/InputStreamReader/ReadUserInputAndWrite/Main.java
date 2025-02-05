package InputStreamReader.ReadUserInputAndWrite;

public class Main {
    public static void main(String[] args) {
        //Create the String and pass file path
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\week\\Week-3\\Day04\\src\\src\\InputStreamReader\\ReadUserInputAndWrite\\Input.txt";
       //Make the object of class and call
        ReadUserInput readInput=new ReadUserInput(filePath);
        //call the read User Input method
        readInput.readUserInput();
    }
}
