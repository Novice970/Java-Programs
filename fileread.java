import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class fileread{
	public static void main(String[] args) throws IOException{
		String filename="grades1.txt";
		Scanner fromfile=new Scanner(new FileReader(filename));
		int grade;	
		while(fromfile.hasNextLine()){
			grade=Integer.parseInt(fromfile.nextLine());
			System.out.println(grade);
		}
	}
}