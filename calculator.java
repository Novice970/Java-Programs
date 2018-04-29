import java.util.Scanner;
public class calculator
    {
    public static void main(String[] args)
        
    {
        Scanner inputop=new Scanner(System.in);
        Scanner inputnum=new Scanner(System.in);
        String op;
        double num1,num2,num3=0;
        System.out.println("enter the first no.:");
        num1=inputnum.nextDouble();
        System.out.println("enter the second no.:");
        num2=inputnum.nextDouble();
        System.out.println("enter the operaTor:");
        op=inputop.next();
        if(op.equals("-"))
            {
        num3=num1-num2;
        }
        else if(op.equals("+")){
            num3=num1+num2;
        }
        else if(op.equals("*")){
            num3=num1*num2;
        }
        else if(op.equals("/")){
            num3=num1/num2;
        }
        else{
            System.out.println("the operator is not identified");
        }
        System.out.println(num3);
    }
}