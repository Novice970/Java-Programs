import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class charfile{
    public static void main(String[] args) throws IOException{
        String filename="chars.txt";
        PrintWriter infile=new PrintWriter(new FileWriter(filename));
        String sentence="there are many good people in this universe";
        int i;
        for(i=0;i<sentence.length();i++){
            infile.write(sentence.charAt(i));
            infile.write("\n");
        }
        infile.close();
    }
}