import java.util.TreeSet;
import java.util.HashSet;
import java.util.*;
public class uniquewords{
    public static void main(String[] args){
        String text="here is the paragrapg of the textwhich we are going to try to collect the unique words of it in the priority queue by using the two queues and they are the hashlist and treelist";
        TreeSet<String> words=new TreeSet<String>();
        //HashSet<String> uwords=new Hashset<String>();
        String[] wds=text.split(" ");
        
        for (String w : wds){
            System.out.println(w);
            
        }
        System.out.println("the total no. of words="+text.length());
        for(String w : wds){
            words.add(w);
        }
        System.out.println("the no. of unique words="+words.size());
        
        
    }
}