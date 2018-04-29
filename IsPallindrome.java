import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class IsPallindrome{
	public static void main(String[] args){
		ArrayList<String> string= new ArrayList<String>();
		String word;
		System.out.print("Enter the word to check: ");
		Scanner input=new Scanner(System.in);
		word=input.next();
		buildAL(string,word);
		if(isPallindrome(string))
			System.out.println(word + " is a pallindrome");
		else
			System.out.println(word + " is not a pallindome");
		
	}

	static void buildAL(ArrayList<String> string, String word){
		for(int i=0;i<word.length();i++){
			string.add(word.charAt(i)+"");
		}
	}	

	static boolean isPallindrome(ArrayList string){
		ArrayList<String> reverse= new ArrayList<String>();
		reverse.addAll(string);
		Collections.reverse(reverse);
		for(int i=0;i<string.size();i++){
			if(!string.get(i).equals(reverse.get(i)))
				return false;
		}
		return true;
	}	

	static void display(ArrayList arr){
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i));
		}
		System.out.println();
	}
}