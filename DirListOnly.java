import java.io.*;
import java.util.Scanner;

public class DirListOnly{
    public static void main(String[] args){
        String dirname="C:\\myjavaprograms\\";
        File f1=new File(dirname);
	Scanner input=new Scanner(System.in);
String extension=input.nextLine();
        FilenameFilter only=new fileext(extension);
        String s[]=f1.list(only);
        
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        System.out.println("\n\n the no. of java proram files you have are"+s.length); 
    }
}