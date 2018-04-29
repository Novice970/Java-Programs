import java.io.*;
import java.util.Scanner;
public class copfiles {
	public static void main(String[] args)throws FileNotFoundException,IOException{
		FileInputStream fin;
		FileOutputStream fout;
		int c;
		
		String infile;
		String outfile;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the input file name");
		infile=input.next();
		System.out.println("Enter the output file name");
		outfile=input.next();
		fin=new FileInputStream(infile);
		fout=new FileOutputStream(outfile);
		c=fin.read();
		while(c!=-1){
			c=fin.read();
			fout.write(c);
		}
		System.out.println("Contents copied");
		fin.close();
		fout.close();
		input.close();
		
	}

}
