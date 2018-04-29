package ThreadPrograms;

public class NewRunnable implements Runnable{
	public void run(){
		System.out.println("This thread "+ Thread.currentThread().getName()+ " was created by passing Runnable Object" );
	}
	
}
