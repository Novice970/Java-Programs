import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
public class file{
    public static void main(String[] args) throws IOException{
        String filename="grades.txt";
File f1=new File("C:\\myjavaprograms",filename);
        PrintWriter outFile=new PrintWriter(new FileWriter(filename));
        String in;
        Scanner input=new Scanner(System.in);
        in =input.nextLine();
        outFile.println(in);
         outFile.println("tyhbedmnbznbc");	
        outFile.println(67);
        outFile.close();
        Scanner inFile=new Scanner(new FileReader(filename));
        String text;
        while(inFile.hasNextLine()){
        text=inFile.nextLine();
            System.out.println(text);
System.out.println();
}
        System.out.println("the file name is"+f1.getName());
        System.out.println("the file path is:"+f1.getPath());
        System.out.println("the absolute path is"+f1.getAbsolutePath());
        
           System.out.println("the parent is"+f1.getParent());
        System.out.println(f1.exists()?"exists":"doesnt exist");
        System.out.println(f1.canRead()?"readable":"not readable");
       System.out.println("is"+(f1.isDirectory()?"a directory":"not a directory"));
           System.out.println("dile last modified :"+f1.lastModified());
        System.out.println("file size is "+f1.length()+"bytes");
        }
    
}