import java.util.ArrayList;
import java.util.Random;

public class myarraylist{
	public static void main(String[] args){
		ArrayList<String> fruits=new ArrayList<String>();
		Random rand=new Random(System.currentTimeMillis());
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			numbers.add(rand.nextInt(101));
		}
		display(numbers);
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Banana");

		System.out.println("The size of arraylist is "+ fruits.size());
		display(fruits);
		change(fruits);
		display(fruits);	
	}

	static void display(ArrayList arr){
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+"   ");
		}
		System.out.println();
	}
	static void change(ArrayList<String> arr){
		for(int i=0;i<arr.size();i++){
			arr.set(i,arr.get(i)+" fruit");
		}
	}
}