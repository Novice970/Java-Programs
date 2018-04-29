import java.util.concurrent.*;

class Shared{
	public static int count;
}

class MyThread extends Thread{
	Semaphore sem;
	String name;
	
	MyThread(Semaphore sem, String name){
		super(name);
		this.sem=sem;
		this.name=name;
	}
	
	public void run(){
		System.out.println(name+ "is trying to acquire the semaphore");
		
			if(name.equals("A")){
				try{
				sem.acquire();
				
				for(int i=0;i<5;i++){
					System.out.println(name+" : "+Shared.count++);
					Thread.sleep(100);
				}
				
			}
				catch(InterruptedException e){
					System.out.print("Error");
					
				}
				
				sem.release();
			}
			else{
				try{
				sem.acquire();
				for(int i=0;i<5;i++){
					System.out.println(name+ " : "+ Shared.count--);
					Thread.sleep(100);
				}
			}
		
			catch(InterruptedException e){
				System.out.print("Error");
				
			}
				
			sem.release();	
		
	}
}

}
public class SemaphoreDemo {
	public static void main(String[] args) throws InterruptedException{
		Semaphore sem= new Semaphore(1);
		
		MyThread t1= new MyThread(sem, "A");
		MyThread t2= new MyThread(sem,"B");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final value of count : "+Shared.count);
		
	}
}
