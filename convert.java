import java.util.*;
public class convert{
 static String decimaltobinary(int num){
     Stack binary=new Stack();
     while(num>0){
         binary.push(num%2);
         num/=2;
      
     }
     String bits="";
     while(!binary.empty())
         {
         bits+=binary.peek();
         binary.pop();
     }
        return bits; 
 }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("entre the number");
        num=input.nextInt();
        System.out.println("the binary value of "+ num+ "is "+decimaltobinary(num));
        
    }
}