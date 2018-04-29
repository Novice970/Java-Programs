import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDemo {
	public static void main(String[] args){
		ArrayList<String> a= new ArrayList<String>();
		
		System.out.println("Initial size of ArrayList:"+ a.size());
		a.add("Puneet");
		a.add("Harpreet");
		a.add("Amandeep");
		a.add(1,"Sandeep");
		System.out.println("Initial size of ArrayList:"+ a.size());
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
	
		ArrayList<String> b= new ArrayList<String>();
		b.add("Farhan");
		b.add("faiza");
		
		System.out.println(Collections.disjoint(a, b));
		
		ArrayList<String> c= new ArrayList<String>();
		c.ensureCapacity(a.size());
		//Collections.addAll(b, a);
		System.out.println(b);
	}

}
