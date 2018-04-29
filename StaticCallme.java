class StaticDemo{
	static int a;
	int b;
	
	static{
		System.out.println("Static variables initialised.");
		a=10;
	}
	
	static void print(){
		System.out.println("The static variable a= "+a);
		//System.out.println("The non-static variable b= "+b);
	}
}
public class StaticCallme {
	public static void main(String[] args){
		StaticDemo.print();
		System.out.println("a= "+StaticDemo.a);
	}
}
