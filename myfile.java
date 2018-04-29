

public class myfile{
	static  void demo(String detail)throws myexception{
		System.out.println("called using " +detail);
		if(detail.length()>5){
			throw new myexception(detail);
			//System.out.println("normal exit");
			
		}
	}
	public static void main(String[] args){
		try{
			demo("abc");
			demo("Puneet");
			
		}
		catch(myexception e){
			System.out.println(e);
			
		}
	}
}