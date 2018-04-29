import java.util.Scanner;
public class trycatch{
    static int denominator,numerator;
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        try
            {
            System.out.println("enter the numerator:");
            numerator=input.nextInt();
                 System.out.println("enter the denominator:");
            denominator=input.nextInt();
            System.out.println("the quotient is:"+(numerator/denominator));
        
        }
        catch(ArithmeticException ae){
            System.out.print("the denominator zero is not acceptable.Please give another try.");
            denominator=input.nextInt();
              System.out.println("the quotient is:"+(numerator/denominator));
        }
    }
}