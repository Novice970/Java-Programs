package ThreadPrograms;

class clicker implements Runnable{
	long click=0;
	private volatile boolean running =true;
	Thread t;
	 
	clicker(int k){
		t=new Thread(this);
		t.setPriority(k);
	}
	
	public void run(){
		while(running){
			click++;
		}
	}
	
	public void stop(){
		running=false;
	}
	
	public void start(){
		t.start();
	}
}

public class HiLoPri {
	public static void main(String[] args){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi=new clicker(Thread.NORM_PRIORITY+2);
		clicker lo=new clicker(Thread.NORM_PRIORITY-2);
		hi.start();
		lo.start();
		
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		lo.stop();
		hi.stop();
	
		try{
			hi.t.join();
			lo.t.join();
			
		}
		catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		
		System.out.println("High priority thread: "+ hi.click);
		System.out.println("Low priority thread:  "+ lo.click);
	}
}
