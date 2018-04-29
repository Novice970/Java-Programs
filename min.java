import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class min{
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        Random rand=new Random(System.currentTimeMillis());
        int i;
        for(i=0;i<100;i++){
            numbers.add(rand.nextInt(101));
            
        }
        System.out.println("enter the number yoiu want to search in the arraylist:");
        int number;
        number=input.nextInt();
        if(numbers.contains(number))
            System.out.println("the number "+number+" is at the "+numbers.indexOf(number)+"position");
        else 
            System.out.println("the number"+number+ "is not present");
    }
}