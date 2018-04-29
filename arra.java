import java.util.ArrayList;
public class arra{
    public static void main(String[] args){
        ArrayList<Integer> names=new ArrayList<Integer>();
        int i;
        for(i=0;i<11;i++)
            {
            names.add(i);
        }
        System.out.println("the numbers in the arraylist: "+names.size());
        displayarraylist(names);
        changearraylist(names,5);
        displayarraylist(names);
        }
    static void displayarraylist(ArrayList<Integer> names){
        int i;
        System.out.println("the array elements are:");
        for(i=0;i<names.size();i++){
            System.out.print(names.get(i)+" ");
        }
    }
    static void changearraylist(ArrayList<Integer> names,int a)
        {
        int i;
        for (i=0;i<names.size();i++)
            {
            names.set(i,i+a);
        }
    }
}