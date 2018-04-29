import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class max{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        int i,num,max;
        for(i=0;i<10;i++){
            num=input.nextInt();
            numbers.add(num);            
            
        }
        max=0;
        for(i=0;i<numbers.size();i++){
            if(numbers.get(i)>max)
                {
                max=numbers.get(i);
            }
        }
        System.out.println("the maximum number is "+max+" and it is located at "+numbers.indexOf(max)+"th position");
    }
}