import java.io.*;
import java.net.*;

public class myserver{
    public static void main(String[] args) throws IOException{
        ServerSocket server=null;
        try{
            server=new ServerSocket(200);
            
        }
        catch( IOException e){
            System.out.println("cant connect to port 200");
            System.exit(1);
            
        }
        Socket client=null;
        System.out.println("listening to client....");
        try{
            client=server.accept();
        }
        catch(IOException e){
            System.out.println("Accept failed");
            System.exit(1);
            
        }
        PrintWriter output=new PrintWriter(client.getOutputStream(),true);
        BufferedReader input=new BufferedReader(new InputStreamReader(client.getInputStream()));
        String inputLine;
        while((inputLine=input.readLine())!=null){
            System.out.println("Server:"+ inputLine);
            output.println(inputLine);
            if(inputLine.equals("bye")){
                break;
            }
        }
    }
}