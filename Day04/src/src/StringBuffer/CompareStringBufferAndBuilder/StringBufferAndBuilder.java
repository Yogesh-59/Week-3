package StringBuffer.CompareStringBufferAndBuilder;

public class StringBufferAndBuilder {
    //creating the instance of class
    public String str;
    //initialize the instance using constructor
     StringBufferAndBuilder(String str){
         this.str=str;
     }
     //Method to calculate the time of String buffer
     public long stringBuffer(){
         int totalTime=1000000;
         //The primary use of System.nanoTime() is to measure elapsed time
         long startTime1=System.nanoTime();
         //make the object of String Buffer
         StringBuffer sb=new StringBuffer();
         //Loop that run in million time
         for (int i=0;i<totalTime;++i){
             sb.append(str);
         }
         //create the variable the show end time
         long endTime=System.nanoTime();
         //subtract the start time and end time
         long duration=(endTime - startTime1)/1000000;
         //return the duration
         return duration;
     }
     //Method to calculate total time String builder
    public long stringBuilder(){
        int totalTime=1000000;
        //The primary use of System.nanoTime() is to measure elapsed time
        long startTime1=System.nanoTime();
        //make the variable of String Builder
        StringBuilder builder =new StringBuilder();
        for (int i=0;i<totalTime;++i){
            builder.append(str);
        }
        long endTime=System.nanoTime();
        long duration=(endTime - startTime1)/1000000;
        //return the duration of String Builder
        return duration;
    }
    //Method to Display result
    public void displayResult(){
         //method to compare stringBuffer and stringBuilder
         if(stringBuffer() >stringBuilder()){
             System.out.println("String builder is faster than: "+(stringBuffer()-stringBuilder())+" ms");
         }
        else{
            System.out.println("String buffer is faster than: "+(stringBuilder()-stringBuffer())+" ms");
        }
    }
}
