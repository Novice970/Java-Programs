import java.io.*;
public class infileoutfile{
    public static void main(String[] args) throws IOException{
        String outfile="output.bak";
        String infile="chars.txt";
        FileReader inf=new FileReader(infile);
        FileWriter outf=new FileWriter(outfile);
        int ch=inf.read();
        while(ch!=-1){
            outf.write(ch);
            ch=inf.read();
            
        }
        inf.close();
        outf.close();
        
    }
}