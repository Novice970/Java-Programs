import java.util.*;
public class stacks{
    public static void main(String[] args){
        Stack names=new Stack();
        names.push("jacob");
        names.push("Mary");
        names.push("julie");
        names.push("katie");
        System.out.println("the name on the top is "+names.peek());
        names.pop();
        System.out.println();
         System.out.println("the name on the top is "+names.peek());   
    }
}