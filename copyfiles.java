import java.io.*;

public class copyfiles{
	public static void main(String[] args) throws Exception{
		String source="source.txt";
		String destination="destination.txt"; 
		FileReader infile=new FileReader(source);
		FileWriter outfile=new FileWriter(destination);
		int ch=infile.read();
		while(ch!=-1){
			outfile.write(ch);
			ch=infile.read();
		}
		infile.close();
		outfile.close();
	}
}