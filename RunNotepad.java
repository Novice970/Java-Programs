
public class RunNotepad {
	public static void main(String[] args){
		Runtime r=Runtime.getRuntime();
		Process p=null;
		try{
			p=r.exec("Notepad");
			p.waitFor();
			System.out.println("The notepad ran sucessfully");
			
		}
		catch(Exception e){
			System.out.println("some interruption occured");
			}
		System.out.println("Notepad returned "+p.exitValue()); 
	}

}
