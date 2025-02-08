package StringVsBuilderVsBuffer;

public class StringConcatenation {
    //Create the instance of class
    public String str;
    public int num;
    //Initialize the instance using constructor
    StringConcatenation(String str,int num){
        this.str=str;
        this.num=num;
    }
    //Method to concatenate the string
    public long concatenation(){
        long startTime=System.nanoTime();
        String temp="";
        for(int i=0;i<num;++i){
            temp +=str;
        }
        return (System.nanoTime() -startTime)/1000000;
    }
}
