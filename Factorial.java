
public class Factorial {
	int fac(int n){
		if(n==1)
			return n;
		else return n*fac(n-1);
	}
	
	public static void main(String[] args){
		Factorial f=new Factorial();
		System.out.println(f.fac(5));
	}
}
