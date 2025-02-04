package FileReader.CountTheOccurrence;

public class Main {
    public static void main(String[] args) {
        //Make String of file path
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\week\\Week-3\\Day04\\src\\src\\FileReader\\CountTheOccurrence\\Note.txt";
        //Set target word of file
        String targetWord="am";
        //creating the object of class and call
        OccurrenceCount cout=new OccurrenceCount(filePath,targetWord);
        //call the display method and print result
        cout.displayResult();
    }
}
