import java.util.Scanner;
public class loop1
    {
    public static void main(String[] args){
        double marks=0,average=0,total=0;
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the marks(-1 to exit)");
           marks=input.nextDouble();
        while(marks!=-1){
     
            ++count;
            total=total+marks;
            System.out.println("enter the more marks");
               marks=input.nextDouble();
        }
        average=total/count;
        System.out.println("\n\n the average of the marks entered="+average);
        
        
    }
}