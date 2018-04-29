class Aa{
	 private int a;
	
	Aa(){
		a=10;
	}
	 
	void show(){
		System.out.println("a = "+a);
	}
	
}

class Bb extends Aa{
	int b;
	void display(){
		System.out.println("B = "+b);
	}
}
public class Inheritance {
 public static void main(String[] args){
	 Bb var= new Bb();
	 var.b=8;
	// var.a=9;
	 var.show();
	 var.display();
 }
	
}
