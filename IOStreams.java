import java.io.*;

public class IOStreams {
	public static void main(String[] args)throws IOException{
		String pathname="C:\\Users\\Puneet Kaur\\Desktop\\BEATBOX";
		FileInputStream fis=new FileInputStream(pathname);
		System.out.println("Availbale Bytes: "+ fis.available());
	
		fis.close();
	}
}

