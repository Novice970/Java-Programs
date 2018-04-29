import java.util.*;
public class linkedlist {

	public static void main(String[] args){
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		l1.add("f");
		l1.add(4,"e");
		
		l2.addAll(l1);
		System.out.println("Contents of l1="+l1);
		System.out.println("Contents of l2="+l2);
		l1.removeLast();
		l2.removeFirst();
		
		
		System.out.println("Contents of l1="+l1);
		System.out.println("Contents of l2="+l2);
		
		Object val=l1.get(3);
		l1.set(3, (String)val+"Changed");
		System.out.println("Contents of l1="+l1);
		System.out.println("Contents of l2="+l2);
		
	}
}
