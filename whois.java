import java.net.*;
import java.io.*;

public class whois{
    public static void main(String[] args) throws Exception{
        Socket sock= new Socket("whois.internic.net",43);
        InputStream input=sock.getInputStream();
        OutputStream output=sock.getOutputStream();
        String s="facebook.com\n";
        byte b[]=s.getBytes();
        output.write(b);
        int ch;
        while((ch=input.read())!=-1){
            System.out.print((char) ch);
        }
    }
}