import java.io.*;
import java.util.Scanner;
class filehandling {
	public static void main(String[] args) throws IOException{
		FileInputStream f;
		int i;
		
		String filename;
		System.out.println("Enter the file's name");
			Scanner input=new Scanner(System.in);
		filename=input.next();
		f=new FileInputStream(filename);
		/*try{
		f= new FileInputStream(filename);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			
		}*/
		do{
			i=f.read();
			if(i!=-1)System.out.println((char)i);
			else break;
			
			
		}while(1!=-1);
		f.close();
	}
	
	

}
