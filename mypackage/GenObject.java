package mypackage;

class G<T>{
	T ob;
	
	G(T o){
		ob=o;
	}
	
	void showType(){
		System.out.println("The type of class: "+ ob.getClass().getName());
	}
}

public class GenObject {
	public static void main(String[] args){
	G<Integer> g=new G<Integer>(88);
	
	g.showType();
	System.out.println(g.ob);
	
	G<String> s=new G<String>("Hello All...");
	s.showType();
	System.out.println(s.ob);
	
	
	}
}
