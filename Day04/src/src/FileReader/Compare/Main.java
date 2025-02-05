package FileReader.Compare;

public class Main {
    public static void main(String[] args) {
        //Make String that take file path
        String filePath="C:\\Users\\india\\OneDrive\\Desktop\\week\\Week-3\\Day04\\Day04\\src\\main\\java\\FileReader\\Compare\\Input.txt";
       //creating the object of class and call
        CompareBufferAndBuilder obj1=new CompareBufferAndBuilder(filePath);
        System.out.println(obj1.stringBuffer());
        System.out.println(obj1.stringBuilder());
        //creating the object of class and call
        FileAndInputStream obj2=new FileAndInputStream(filePath);
        System.out.println(obj2.fileReader());
        System.out.println(obj2.readUserInput());

    }
}
