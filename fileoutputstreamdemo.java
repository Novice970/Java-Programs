 import java.io.*;
 
 class fileoutputstreamdemo{
        public static void main(String[] args) throws Exception{
            String source="it is the time for all good men to come up and poay their taxes";
            byte b[]=source.getBytes();
            OutputStream f= new FileOutputStream("file.txt");
            for( int i=0;i<b.length;i++){
                f.write(b[i]);
            }
            f.flush();
            f.close();
            OutputStream f1= new FileOutputStream("File1.txt");
            f1.write(b);
            f1.close();
            OutputStream f2=new FileOutputStream("File2.txt");
            f2.write(b,0,b.length);
            f2.close();
            
        }
 }