package StringVsBuilderVsBuffer;

public class StringBuilderConcatenation {
    //Create the instance of class
    public String str;
    public int num;
    //Initialize the instance using constructor
    StringBuilderConcatenation(String str, int num){
        this.str=str;
        this.num=num;
    }
    //Method to concatenate String using StringBuilder
    public long stringBuilder(){
        long startTime=System.nanoTime();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<num;++i){
            sb.append(str);
        }
        return (System.nanoTime() -startTime)/1000000;
    }
}
