package mypackage;
import java.io.*;

public class ReadConsoleInput {
	public static void main(String[] args) throws IOException{
		
//	BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
	
	PrintWriter p= new PrintWriter(System.out, true);
	
	p.println("Hello to all this worlds and the skies and the universe.");
	p.println(2135467);
/*	
	String c;
	
	
		do{
			c= r.readLine();
			System.out.print(c);
	
	}while(!c.equals("exit"));

*/
	}
}
