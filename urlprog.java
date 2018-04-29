import java.net.*;
import java.io.*;
import java.util.Scanner;

public class urlprog{
    public static void main(String[] args) throws Exception{
System.out.println("enter the url");

	Scanner input=new Scanner(System.in);
        URL theurl=new URL("http://www.infiniteskills.com");
        System.out.println("Basic Information:");
        System.out.println("the port is: "+theurl.getHost());
        System.out.println("the protocol used is: "+theurl.getProtocol())
;
        System.out.println("the hist is: "+ theurl.getPort());
        URLConnection theconn=theurl.openConnection();
        int contentLength=theconn.getContentLength();
        int c;
        if (contentLength!=0){
            System.out.println("Content:\n");
            InputStream urlinput=theconn.getInputStream();
            
            while((c=urlinput.read())!=-1){
                System.out.print((char)c);
            }
        }
    }
}