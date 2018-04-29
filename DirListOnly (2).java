import java.io.*;

public class DirListOnly {
	public static void main(String[] args){
		String dirname="C:/Users/Puneet Kaur/Desktop/BEATBOX";
		File f1= new File(dirname);
		FilenameFilter only=new OnlyExt("html");
		File array[]=f1.listFiles(only);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i].getName());
			System.out.println(array[i].lastModified());
			System.out.println(array[i].getParentFile());
			System.out.println();
		}
	}
}
