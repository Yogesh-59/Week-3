package StringVsBuilderVsBuffer;

public class Main {
    public static void main(String[] args) {
        //Create string variable
        String str="Hello";
        //create array that take three number
        int []arr={1000,10000,1000000};
        //using loop that iterate array element
        for(int num:arr){
            //Creating the object of class and call
            StringConcatenation string=new StringConcatenation(str,num);
            //call the method of class
            long stringTime=string.concatenation();
            System.out.println("String time for concatanation: "+stringTime);

            StringBufferConcatenate stringBuffer=new StringBufferConcatenate(str,num);
            long stringBufferTime= stringBuffer.stringBuffer();
            System.out.println("String Buffer time for concatanation: "+stringBufferTime);

            StringBuilderConcatenation builder=new StringBuilderConcatenation(str,num);
            long stringBuilderTime=builder.stringBuilder();
            System.out.println("String Builder time for concatanation: "+stringBuilderTime);
            //print the all operation time
            System.out.println(stringTime +", "+stringBufferTime+", "+stringBuilderTime);
            System.out.println("--------------------------------------------------------");
        }
    }
}
