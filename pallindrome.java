import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class pallindrome{
    public static void main(String[] args){
        String text;
        ArrayList<String> word=new ArrayList<String>();
        Scanner input=new Scanner(System.in);
        System.out.println("enter the text to examine:");
        text=input.next();
        buildAL(word,text);
        display(word);
    
        if(ispallindrome(word))
            System.out.println(text+" is  a pallindrome");
        else
            System.out.println(text+" is not a pallindrome");
    }
    static void display(ArrayList<String> word){
        int i;
        System.out.println("the arraylist contains:");
        for(i=0;i<word.size();i++)
            System.out.print(word.get(i));
        System.out.println("\n");
    }
    static void buildAL(ArrayList<String> word,String text)
        {
        int i;
        for(i=0;i<text.length();i++){
            word.add(text.charAt(i)+"");
        }
     
        
    }
    static boolean ispallindrome(ArrayList<String> word)
        {
        int i;
        ArrayList<String> rword=new ArrayList<String>();
        rword.addAll(word);
        Collections.reverse(rword);
        for(i=0;i<word.size();++i)
            if(!(rword.get(i).equals (word.get(i))))
                return false;
            
        
        return true;
    }
}