import java.io.*;
public class fileext implements FilenameFilter{
    String ext;
    
    public fileext(String extension){
        this.ext=extension;
    }
    
    public boolean accept(File dir,String filename){
        return filename.endsWith(ext);
    }
}