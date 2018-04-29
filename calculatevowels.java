import java.util.Scanner;
public class calculatevowels
    {
    public static void main(String[] args)
        {
        Scanner input =new Scanner(System.in);
        String text;
        System.out.println("enter the sentence:    ");
        text=input.nextLine();
        int i,count=0;
        for(i=0;i<text.length();i++){
            if(text.charAt(i)=='a'|text.charAt(i)=='e'|text.charAt(i)=='i'|text.charAt(i)=='o'|text.charAt(i)=='u')
                {
                count++;
            }
        }
        System.out.print("the no of vowels="+count);
        
    }
}