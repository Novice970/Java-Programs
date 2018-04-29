package ThreadPrograms;

public class DemoThreads {
	public static void main(String[] args){
		new NewThread("child");
		try{
			for(int i=0;i<5;i++){
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread interrupted");
		}
		System.out.println("Exiting main.");
		}
}
