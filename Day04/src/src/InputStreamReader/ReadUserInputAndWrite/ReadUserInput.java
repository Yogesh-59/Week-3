package InputStreamReader.ReadUserInputAndWrite;

import java.io.*;
import java.util.*;
public class ReadUserInput {
    //Creating the instance of class
    public String filePath;
    //Using Constructor to initialize the constructor
     ReadUserInput(String filePath){
         this.filePath=filePath;
     }
     //Method to resd user input
     public void readUserInput(){

         // Create InputStreamReader and BufferedReader to read from the console
         try(InputStreamReader isr=new InputStreamReader(System.in);
             BufferedReader br=new BufferedReader(isr);
             FileWriter fw =new FileWriter(filePath);
             BufferedWriter bw =new BufferedWriter(fw)){
             String userInput;
             while(true){
                 //read user input
                 userInput= br.readLine();
                 //Check condition if text file contain exit so they are Exiting
                 if("exit".equalsIgnoreCase(userInput)){
                     System.out.println("Exiting..");
                     break;
                 }
                 //write the user input in file
                 bw.write(userInput);
                 bw.newLine();
             }
         }
         //catch block handle the exception
         catch(IOException e){
             System.out.println("Error is occured : "+e.getMessage());
         }
     }
}
