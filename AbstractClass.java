abstract class figure{
	int dim1, dim2;
	
	figure(int a, int b){
		dim1=a;
		dim2=b;
	}
	abstract int area();
}

class Rectangle extends figure{
	Rectangle(int l, int b){
		super(l,b);
	}
	
	int area(){
		return dim1*dim2;
	}
}

class Triangle extends figure{
	Triangle(int h, int b){
		super(h,b);
	}
	
	int area(){
		return (dim1 * dim2)/2;
	}
}
public class AbstractClass {
	public static void main(String[] args){
		Triangle t= new Triangle(4,5);
		Rectangle r= new Rectangle(6,7);
		
		System.out.println("Area of rectangle = "+r.area());
		System.out.println("Area of Triangle = "+t.area());
		
	}
}
