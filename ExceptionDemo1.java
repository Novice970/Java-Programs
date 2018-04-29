class ExceptionSample extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a;
	
	ExceptionSample(int i){
		a=i;
	}
	public String toString(){
		return ("MyException "+ a);
		
	}
}
public class ExceptionDemo1 {
	static void demo() throws Exception{
		try{
			throw new ExceptionSample(3);
		}
		catch(ExceptionSample e){
			System.out.println(e);
		}
		finally{
			System.out.println("In finally");
			//throw new ExceptionSample(5);
		}
	}
	public static void main(String[] args){
		try{
			demo();
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("In usthe main Functions's finally block");
		}
	}
}
