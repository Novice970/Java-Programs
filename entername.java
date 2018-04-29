import java.util.Scanner;
public class entername
    {
    public static void main(String[] args)
        {
        String name;
        Scanner input=new Scanner(System.in);
        System.out.print("tell me your name:");
        name=input.next();
        System.out.print("Your name is "+name);
    }
}