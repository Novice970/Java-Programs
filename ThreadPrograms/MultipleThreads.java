package ThreadPrograms;

public class MultipleThreads {
	public static void main(String[] args){
		NewThread ob1=new NewThread("One ");
		NewThread ob2=new NewThread("Two");
		NewThread ob3=new NewThread("Three ");
		
		try{
			System.out.println("Thread one is alive? "+ob1.t.isAlive());
			System.out.println("Thread two is alive? "+ob2.t.isAlive());
			System.out.println("Thread three is alive? "+ob3.t.isAlive());
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interruppted");
			
		}
		System.out.println("Thread one is alive? "+ob1.t.isAlive());
		System.out.println("Thread two is alive? "+ob2.t.isAlive());
		System.out.println("Thread three is alive? "+ob3.t.isAlive());
		System.out.println("Exiting Main.");
	}
	
}
