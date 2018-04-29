import java.util.Scanner;
    public class scanner
    {
    public static void main(String[] args)
        {
        Scanner input=new Scanner(System.in);
        int num1,num2,num3;
        System.out.printf("enter the number1=");
        num1=input.nextInt();
        System.out.printf("enter the second no.");
        num2=input.nextInt();
        num3=num1+num2;
        System.out.printf("the sum is"+ num3);
        
    }
}