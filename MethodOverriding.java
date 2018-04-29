class Foo{
	
	void display(){
		System.out.println("Inside Foo");
	}
}

class Bar extends Foo{
	void display(){
		System.out.println("Inside Bar");
	}
}
public class MethodOverriding {
	public static void main(String[] args){
	Foo f =new Foo();
	Bar b= new Bar();
	Foo r;
	r=f;
	r.display();
	r=b;
	r.display();
	}
}
