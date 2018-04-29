import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class sort{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> names=new ArrayList<Integer>();
        int i,name;
        for(i=0;i<10;i++)
            {
            name=input.nextInt();
            names.add(name);
            
        }
        display(names);
        Collections.sort(names);
        display(names);
    }
    static void display(ArrayList<Integer> names)
        {
        int i;
        System.out.println("the names in the list are:   ");
        for(i=0;i<names.size();i++){
            System.out.print(names.get(i)+" ");
        }
    }
}