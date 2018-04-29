import java.util.Scanner;
public class iseven{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int num;
        System.out.println("enter the number:");
        num=input.nextInt();
        if(Iseven(num)){
            System.out.println("the number "+num+ "is even ");
        }
        else {
            System.out.println("the number "+ num +"is odd");
        }
        
    }
static boolean Iseven(int num){
    if(num%2==0)
        return true;
    else return false;
}
}