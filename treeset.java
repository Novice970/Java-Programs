import java.util.*;


public class treeset {
	public static void main(String[] args){
		TreeSet l1=new TreeSet();

		
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("e");
		l1.add("f");
		l1.add("b");
		Iterator i=l1.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		//l1.add(4,"e");
		
		// System.out.println(l1);
	}

}
