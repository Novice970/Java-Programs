
public class NativeDemo {
	int i;
	public static void main(String[] args){
		NativeDemo ob=new NativeDemo();
		
		ob.i=10;
		System.out.println("the curent value of ob.i is "+ob.i);
		
		ob.test();
		System.out.println("The chsnged value of ob.i is"+ob.i);
	}
	public native void test();
	static{
		System.loadLibrary("NativeDemo");
	}

}
