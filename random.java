import java.util.Random;
import java.util.ArrayList;
public class random{
    public static void main(String[] args){
        Random rand=new Random(System.currentTimeMillis());
        int i,number;
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        for(i=0;i<10;i++)
            {
            number=rand.nextInt(100);
            numbers.add(number);
            
        }
        display(numbers);
    
    }
    static void display(ArrayList<Integer> numbers){
        int i;
        System.out.println("the arraylist elements are:   ");
        for(i=0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
            
    }
}