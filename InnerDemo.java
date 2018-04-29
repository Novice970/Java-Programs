class Outer{
	int x;
	
	void display(){
		Inner inner=new Inner();
		inner.show();
	}
	
	class Inner{
		void show(){
			System.out.println("x in Outer class :"+x);
		}
	}
}
public class InnerDemo {
	public static void main(String[] args){
		Outer outer=new Outer();
		outer.display();
	}

}
