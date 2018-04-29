package ThreadPrograms;

public class NewThread1 extends Thread{
	public void run(){
		System.out.println("This thread "+ currentThread().getName()+ " was created by extending a NewThread1 class");
	}
}
