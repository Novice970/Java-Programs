import java.util.Scanner;

public class AddNumbers{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int number, number1,sum;
		System.out.println("Enter the number: ");
		number=input.nextInt();
		System.out.println("Enter the number 2: ");
		number1=input.nextInt();
		sum=number+number1;
		System.out.println("Sum ="+ sum);

		String name;
		name=input.nextLine();
		System.out.println("Hello "+ name);

}
}