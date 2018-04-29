import java.util.Scanner;

public class Game{
	public static void main(String[] args){
		int n=3;
		Scanner input=new Scanner(System.in);
		String answer="";
		System.out.println("What is the name of computer that plays Jeopardy?");
		answer=input.nextLine();
		if(answer== "Watson" || answer=="watson" || answer=="WATSON"){
			System.out.println("Right Answer!!");
			
			else{
				System.out.println("Try Again");
				answer=input.nextLine();
				if(answer== "Watson" || answer=="watson" || answer=="WATSON"){
				System.out.println("Right Answer!!");
			}
			}
		}
		else{
			System.out.println("Try Again");
			answer=input.nextLine();
		}
		
		if(answer== "Watson" || answer=="watson" || answer=="WATSON"){
			System.out.println("Right Answer!!");
		}
		else{
			System.out.println("Right Answer is Watson");
			
		}
	}
}