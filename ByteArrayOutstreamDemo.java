import java.io.*;

public class ByteArrayOutstreamDemo{
        public static void main(String[] args) throws Exception{
            String source="this should be the end of array";
            byte b[]=source.getBytes();
            ByteArrayOutputStream f=new ByteArrayOutputStream();
            f.write(b);
            System.out.println("Buffer as string=\n"+f.toString());
            OutputStream f2= new FileOutputStream("test.txt");
            f.writeTo(f2);
            f2.close();
            System.out.println("doing the reset of bytearrayoutput stream");
            //f.reset();
            for(int i=0;i<3;i++){
                f.write('x');
                
            }
            System.out.println(f.toString());
            System.out.println(f2.toString()); 
        }
}