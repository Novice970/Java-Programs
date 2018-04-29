package mypackage;
import java.io.*;

public class FileReading {
	public static void main(String [] args) throws IOException{
		FileInputStream fin;
		FileOutputStream fout;
		try{
			fin= new FileInputStream("C:\\myjavarograms\\sample.txt");
			fout=new FileOutputStream("C:\\myjavarograms\\mypet\\src\\mypackage\\copy.txt");
			int i;
			do{
				i=fin.read();
				if(i!=-1)
					fout.write(i);
					System.out.print((char)i);
				
			}while(i!=-1);
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Could not open file");
		}
		
		
	}
}
