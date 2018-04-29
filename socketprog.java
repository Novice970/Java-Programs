import java.net.*;
import java.io.*;

public class socketprog{
    public static void main(String[] args) throws IOException{
        ServerSocket serverSock= null;
        InetAddress address= InetAddress.getLocalHost();
        System.out.println(address);
       
        
        try{
            serverSock=new ServerSocket(10007);
            
        }
        catch(IOException e){
            System.out.println("couldnot listen to the server..");
            System.exit(1);
        }
        Socket clientSock=null;
        System.out.println("Listening for connection....");
         
        try{
            clientSock=serverSock.accept();
            int port=clientSock.getPort();
           System.out.println(port);
            //System.out.println(clientSock.getLocalHost());
            //System.out.println(clientSock.getLocalHost());
            
        } 
        catch(IOException e){
            System.out.println("Connection not accepted");
            System.exit(1);
            
        }
        System.out.println("Connection succesful");
        System.out.println("Listening for input");
        PrintWriter output=new PrintWriter(clientSock.getOutputStream(),true);
        BufferedReader input =new BufferedReader( new InputStreamReader(clientSock.getInputStream()));
        String inputLine;
        while((inputLine=input.readLine())!=null){
            System.out.println("Server:"+ inputLine);
            output.println(inputLine);
            if (inputLine.equals("Bye")){
                break;
            }
            output.close();
            input.close();
            clientSock.close();
            serverSock.close();
            
        }
    }
}