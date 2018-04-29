import java.util.*;
public class arraylist {
	public static void main(String[] args){
		ArrayList a1=new ArrayList();
		a1.add(new Integer(10));
		a1.add(new Integer(20));
		a1.add(new Integer(30));
		a1.add(new Integer(40));
		a1.add(new Integer(50));
		
		System.out.println("Contents of a1="+a1);
		
		Object a[]=a1.toArray();
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=((Integer)a[i]).intValue();
		}
		
		System.out.println("THe sum="+sum);
		
		
	}

}
