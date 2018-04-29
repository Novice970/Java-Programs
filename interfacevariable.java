
public class interfacevariable {
	
	public static void main(String[] args){
		stackinterface si;
		StaticStack ss=new StaticStack(5);
		DynamicStack ds=new DynamicStack(5);
		
		si=ss;
		for(int i=0;i<5;i++) si.push(i);
		
		si=ds;
		for(int i=0;i<7;i++) si.push(i);
		
		System.out.println("Poping the arrayelements of Dynamic Array");
		for(int i=0;i<7;i++) System.out.println(si.pop());
		
		si=ss;
		System.out.println("Poping the array elements of Static Array");
		for(int i=0;i<7;i++)System.out.println( si.pop());
		
		System.out.println("GOodBye...");
		
		
	}

}
