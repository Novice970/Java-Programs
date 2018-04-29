
public class testclone implements Cloneable{
	int a;
	double b;
	
	public Object Clone(){
		try{
			return (testclone)super.clone();
			
		}
		catch(CloneNotSupportedException e){
			System.out.println("Clone not allowed");
			return this;
		}
	}

}
