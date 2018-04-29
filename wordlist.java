import java.util.*;
import java.util.Iterator;

public class wordlist{
    public static void main(String[] args){
     String text;
        text="there are many words in this peice of text and all have to be mapped so that we can count all these words and then we can my name is kirpal singh i live in khamariya patti ouranpur pilibhit my father's name is surjit singh my mothers name is prakash kaur.i have 2 brothers and three sisters";
        String[] words=text.split(" ");
        Arrays.sort(words);
        for(String w:words){
            System.out.println(w);
        }
        String thisword;
        String nextword;
        int count=0;
        HashMap<String,Integer> wordlist=new HashMap<String,Integer>();
        for(int i=0;i<(words.length-1);++i){
            thisword=words[i];
            count++;
            nextword=words[i+1];
            if(!nextword.equals(thisword)){
                wordlist.put(thisword,count);
                count=0;
            }
            if(thisword.equals(words[words.length-1])){
                if (thisword.equals(nextword)){
                    count++;
                }
                else count=1;
                if(words.length%2!=0){
                    wordlist.put(nextword,count);
                }
                Set set=wordlist.entrySet();
                Iterator i=set.iterator;
                while(i.hasNext()){
                    Map.Entry me=(Map.Entry)i.next();
                    System.out.print(me.getKey()+":"+me.getValue());
                }
                
            }
            
        }
    }
}