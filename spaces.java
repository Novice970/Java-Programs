import java.util.Scanner;
public class spaces
    {
    public static void main(String[] args){
        String text;
        Scanner input=new Scanner(System.in);
        System.out.print("entre the string to examine");
        text=input.nextLine();
        int i,count=0;
        for(i=0;i<text.length();i++){
            if (text.charAt(i)!=' ')
                continue;
            count++;
        }
        System.out.println("there are "+count+ "spaces.");
    }
}