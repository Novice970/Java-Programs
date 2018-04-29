import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filetry{
	public static void main(String[] args) throws IOException{
		String filename="grades1.txt";
		PrintWriter input=new PrintWriter(new FileWriter(filename));
		input.println(89);
		input.println(77);
		input.close();
	}
}