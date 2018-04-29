import java.io.*;

public class FileInputStreamDemo{
    public static void main(String[] args) throws Exception{
        InputStream f=new FileInputStream ("FileDemo.txt");
            int size;
        System.out.println("Total available bytes="+(size=f.available()));
        int n=size/4;
        System.out.println("Printing the next "+n+" bytes" );
        for (int i=0;i<n;i++){
            System.out.print((char) f.read());
            
        }
        System.out.println("Still available bytes:"+f.available());
        System.out.println("printing next n bytes using the buffer");
        byte b[]=new byte[n];
        if(f.read(b)!=n){
            System.err.println(n+" bytes could not be read");
        }
        System.out.println(new String(b,0,n));
        f.skip(size/2);
        System.out.println("Skipping the half of the remaining bytes");
        System.out.println("the stilll available bytes are "+f.available());
         if(f.read(b,n/2,n/2)!=n/2){
            System.err.println(n+" bytes could not be read");
        }
        System.out.println(new String(b,0,b.length));
        //System.out.println(f.getChannel());
        
        }
    }
