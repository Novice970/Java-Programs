class MyClass implements MyInterface{
	public void callme(){
		System.out.println("Inside MyClass's callme function.");
	}
} 

class MyClass2 implements MyInterface{
	public void callme(){
		System.out.println("Inside MyClass2's Callme function");
	}
}
public class InterfaceDemo {
	public static void main(String[] args){
		
	MyClass a= new MyClass();
	MyClass2 b= new MyClass2();
	MyInterface ref;
	ref=a;
	ref.callme();
	ref=b;
	ref.callme();
	}
}
