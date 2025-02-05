package LinearSearch.SearchASpecificWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create the array type String and put sentance
       String []arr={"The code is run properly"};
       //set target word
       String targetWord="is";
       //Create the object of class and call
        SearchSpecificWord word=new SearchSpecificWord(arr,targetWord);
        word.searchWord();

    }
}
