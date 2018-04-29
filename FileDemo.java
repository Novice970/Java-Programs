import java.io.File;
import java.util.Scanner;
import java .io.*;

public class FileDemo{
    public static void main(String[] args) throws IOException {
       
           String filename="FileDemo.txt";
             File f1= new File("c:\\myjavaprograms",filename);
           
        
        PrintWriter write=new PrintWriter(new FileWriter(filename));
         write.println("jjfsjfbkbk");
           write.println("hello wto all the Spinsters and the Bachelors");
          
          System.out.println("");
           write.close();
           String l;
           Scanner input =new Scanner(new FileReader(filename));
             
           while(input.hasNextLine()){
           l=input.nextLine();
               System.out.println(l);
                
             
           }
         System.out.println();
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