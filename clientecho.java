import java.net.*;
import java.io.*;

public class clientecho{
    public static void main(String[] args){
        Socket sock=null;
        
        PrintWriter output=null;
        BufferedReader input=null;
        try{
            sock=new Socket("192.168.72.1",10007);
            output=new PrintWriter(sock.getOutputStream(),true);
            input=new BufferedReader(new InputStreamReader(sock.getInputStream()));
        }
        catch(UnknownHostException e){
            System.out.println("Unknown host");
            System.exit(1);
            
        }
        catch(IOException e){
            System.out.println("Cannot connect to host");
            System.exit(1);
            
        }
            
            
        }
    }
