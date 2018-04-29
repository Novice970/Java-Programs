import java.util.Scanner;
public class disc{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
      //  Scanner input1=new Scanner(System.in);
        double cost,discount,items;
        System.out.println("enter the cost of the commodity:");
        cost=input.nextDouble();
        System.out.println("enter the pure discount:");
        discount=input.nextDouble();
        System.out.println("enter the no. of itrms you will buy:");
        items=input.nextDouble();
        System.out.println("the amount you have to pay is "+calamount(cost,discount,items));
    }
    static double calamount(double cost,double discount,double items){
        return(items*(cost-(cost*(discount/100))));
    }
}