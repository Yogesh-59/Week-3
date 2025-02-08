package StringVsBuilderVsBuffer;

public class StringBufferConcatenate {
    //Create the instance of class
    public String str;
    public int num;
    //Initialize the instance using constructor
    StringBufferConcatenate(String str,int num){
        this.str=str;
        this.num=num;
    }
    //Method to concatenate String using StringBuffer
    public long stringBuffer(){
        long startTime=System.nanoTime();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<num;++i){
            sb.append(str);
        }
        return (System.nanoTime() -startTime)/1000000;
    }
}
