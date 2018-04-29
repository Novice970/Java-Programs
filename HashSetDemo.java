import java.util.*;

public class HashSetDemo {
	public static void main(String[] args){
		TreeSet<String> a= new TreeSet<String>();
		a.add("B");
		a.add("A");
		a.add("D");
		a.add("E");
		a.add("C");
		a.add("F");
		
		System.out.println(a);
		System.out.println(a.subSet("C", true, "F", true));
	}

}
