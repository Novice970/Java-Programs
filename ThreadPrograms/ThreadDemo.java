package ThreadPrograms;
class NThread extends Thread{
	 
	 
	 NThread(String name){
		 new Thread(name);
		 System.out.println("Current Thread :"+this);
		 start();
	 }
	 
	 public void run(){
		try{
			for(int i=0;i<5;i++){
			 System.out.println( "Child Thread :"+i);
			 Thread.sleep(1000);
		 }
		}
		catch(InterruptedException e ){
			System.out.println("Child thread interrupteed. ");
		}
		System.out.println("Exiting child thread");
	 }
	
}
public class ThreadDemo {
	public static void main(String[] args){
		new NThread("Demo thread");
		
		try{
			for(int j=0;j<5;j++){
			System.out.println("Main Thread: "+ j);
			Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Interrupted Main Thread.");
		}
		System.out.println("Exiting main ");
	}
}


