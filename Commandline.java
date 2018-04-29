
public class Commandline {
	public static void main(String[] args){
		Runtime r=Runtime.getRuntime();
		Process p=null;
		System.out.println(System.getProperties());
		String comm[]=new String[5];
		comm[0]=new String("cd c:\\");
		comm[1]=new String("del dancers.txt");
		try{
		p = r.exec(comm[0]);
		}
		catch(Exception e){
			System.out.println("Error occured");
			
		}
		
		
	}

}
