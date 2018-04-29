import java.util.Scanner;
public class quesans{
    public static void main(String[] args)
        {
        String ans;
        int tries=0;
        Scanner input=new Scanner(System.in);
        System.out.println("which computer plays jeopardy?");
        while (tries<=3){
            ans=input.nextLine();
            tries++;
            if(ans.equals("Watson")){
                System.out.println("the answer is right");
                break;
            }
            else if ( tries<3){
                System.out.println("next try");
            }
            else{
                System.out.println("the right answer=Watson");
            }
        }
    }
}